package entelect;

/**
 * @author Mothusi Molorane
 */
public class Ace extends Card {

    private static final Byte alterValue = 11;

    public Ace(String name, CardType cardType) {
        super(name, cardType);
    }
    
    public static byte getAlternativeValue() {
    	return alterValue;
    }
}
