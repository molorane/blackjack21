package entelect;

/**
 * @author Mothusi Molorane
 */
public abstract class CardStore {
    
    public Card getCard(String name, CardType cardType){
        return createCard(name, cardType);
    }
    
    protected boolean isValidCardName(String name) {
        // Declare valid card names as per standard deck of playing cards
        String validCards = "A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K";
        return validCards.contains(name);
    }
    
    protected abstract Card createCard(String name, CardType cardType);
    protected abstract int getUsedCards();
}
