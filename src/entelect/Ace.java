/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entelect;

/**
 * @author Mothusi Molorane
 */
public class Ace extends Card {

    private Byte alterValue;

    public Ace(String name, CardType cardType) {
        super(name, cardType);
        this.alterValue = 11; // set alternative value of an ace card to 11
    }

    /**
     * @return the alterValue
     */
    public Byte getAlterValue() {
        return alterValue;
    }

    /**
     * @param alterValue the alterValue to set
     */
    public void setAlterValue(Byte alterValue) {
        this.alterValue = alterValue;
    }

}
