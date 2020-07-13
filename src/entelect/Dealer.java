/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entelect;

import java.util.Set;

/**
 * @author Mothusi Molorane
 */
public class Dealer extends Player {

    public Dealer(String name) {
        super(name);
    }

    public Dealer(String name, Set<Card> cards) {
        super(name, cards);
    }
}
