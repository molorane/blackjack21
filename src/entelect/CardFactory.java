package entelect;

/**
 * @author Mothusi Molorane
 */
public class CardFactory extends CardStore {

	
	private static volatile CardFactory cardFactoryInstance;
	private int cardsUserd = 0;
	
	
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

        cardsUserd++;
        
        if (name.equalsIgnoreCase("A")) {
            return new Ace(name, cardType);
        } else {
            return new Card(name, cardType);
        }
    }

    @Override
	public int getUsedCards() {
		return cardsUserd;
	}

}
