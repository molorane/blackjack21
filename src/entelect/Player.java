/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entelect;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mothusi Molorane
 */
public class Player {
    
    private String name;
    
    /*
    * Cards cannot repeat, for example we can not have two Jack of Spades
    * Set ensures each player has unique cards
    */
    private Set<Card> cards;
    private int total;
    
    
    public Player(String name){
        this.name = name;
        this.cards = new HashSet<>();
    }
    
    public Player(String name, Set<Card> cards){
        this.name = name;
        this.cards = cards;
    }
    
    public void addCard(Card card){
        this.getCards().add(card);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cards
     */
    public Set<Card> getCards() {
        return cards;
    }

    /**
     * @param cards the cards to set
     */
    public void setCards(Set<Card> cards) {
        this.cards = cards;
    }

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
    
}
