/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entelect;

/**
 * @author Mothusi Molorane
 */
public class CardFactory extends CardStore {

	
	private static volatile CardFactory cardFactoryInstance;
	
	
	private CardFactory() {}
	
	public static CardFactory getInstance() {
        if (cardFactoryInstance == null) {
            synchronized (CardFactory.class) {
                if (cardFactoryInstance == null) {
                	cardFactoryInstance = new CardFactory();
                }
            }
        }
        return cardFactoryInstance;
    }
	
    @Override
    protected Card createCard(String name, CardType cardType) {
        if (!isValidCardName(name)) {
            throw new InvalidCardException("Invalid card name "+name);
        }

        if (name.equalsIgnoreCase("A")) {
            return new Ace(name, cardType);
        } else {
            return new Card(name, cardType);
        }
    }

}
