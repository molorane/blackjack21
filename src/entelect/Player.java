package entelect;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mothusi Molorane
 */
public class Player {
    
    private String name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Card> getCards() {
        return cards;
    }

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
