/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entelect;

import java.util.List;
import java.util.Set;

/**
 * @author Mothusi Molorane
 */
public class Entelect {
	

	private static CardStore store = CardFactory.getInstance();

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	TestCase();
    }
    

    public static void TestCase() {
    	 // Dealer
        Card jackOfSpades = store.createCard("J", CardType.SPADES);
        Card nineOfHearts = store.createCard("9", CardType.HEARTS);
        Player dealer = new Player("Dealer", Set.of(jackOfSpades, nineOfHearts));
        
        // Player Lemmy
        Card aceOfSpades = store.createCard("A", CardType.SPADES);
        Card sevenOfHearts = store.createCard("7", CardType.HEARTS);
        Card aceOfDiamonds = store.createCard("A", CardType.DIAMONDS);
        Player lemmy = new Player("Lemmy", Set.of(aceOfSpades, sevenOfHearts, aceOfDiamonds));
        
        // Player Andrew
        Card kingOfDiamonds = store.createCard("K", CardType.DIAMONDS);
        Card fourOfSpades = store.createCard("4", CardType.SPADES);
        Card fourOfClubs = store.createCard("4", CardType.CLUBS);
		Player andrew = new Player("Andrew", Set.of(kingOfDiamonds, fourOfSpades, fourOfClubs));
        
        // Player Billy
        Card twoOfSpades = store.createCard("2", CardType.SPADES);
        Card twoOfDiamonds = store.createCard("2", CardType.DIAMONDS);
        Card twoOfHearts = store.createCard("2", CardType.HEARTS);
        Card fourOfDiamonds = store.createCard("4", CardType.DIAMONDS);
        Card fiveOfClubs = store.createCard("5", CardType.CLUBS);
        Player billy = new Player("Billy", Set.of(twoOfSpades, twoOfDiamonds, twoOfHearts, fourOfDiamonds, fiveOfClubs));
        
        // Player Carla
        Card queenOfClubs = store.createCard("Q", CardType.CLUBS);
        Card sixOfSpades = store.createCard("6", CardType.SPADES);
        Card nineOfDiamonds = store.createCard("9", CardType.DIAMONDS);
        Player carla = new Player("Carla", Set.of(queenOfClubs, sixOfSpades, nineOfDiamonds));
        
        Playable blackJack21 = new BlackJack21(dealer, List.of(lemmy, andrew, billy, carla));
        blackJack21.start();
    }
    
    
    public static void examples(){
    	 // Dealer
        Card sixOfClubs = store.createCard("6", CardType.CLUBS);
        Card nineOfClubs = store.createCard("9", CardType.CLUBS);
        Player dealer = new Player("Dealer", Set.of(sixOfClubs, nineOfClubs));
        
        // Player Andrew
        Card nineOfHearts = store.createCard("9", CardType.HEARTS);
        Card sixOfSpades = store.createCard("6", CardType.SPADES);
        Card jackOfHearts = store.createCard("J", CardType.HEARTS);
        Player lemmy = new Player("Andrew", Set.of(nineOfHearts,sixOfSpades,jackOfHearts));
        
        // Player Billy
        Card queenOfDiamonds = store.createCard("Q", CardType.DIAMONDS);
        Card kingOfClubs = store.createCard("K", CardType.CLUBS);
        Player andrew = new Player("Billy", Set.of(queenOfDiamonds,kingOfClubs));
        
        // Player Carla
        Card twoOfClubs = store.createCard("2", CardType.CLUBS);
        Card nineOfDiamonds = store.createCard("9", CardType.DIAMONDS);
        Card kingOfSpades = store.createCard("K", CardType.SPADES);
        Player billy = new Player("Carla", Set.of(twoOfClubs,nineOfDiamonds,kingOfSpades));
        
        Playable blackJack21 = new BlackJack21(dealer, List.of(lemmy,andrew,billy));
        blackJack21.start();
    }
    
}
