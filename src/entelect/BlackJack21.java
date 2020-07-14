/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entelect;

import java.util.List;

/**
 * @author Mothusi Molorane
 */
public class BlackJack21 implements Playable {

	private Player dealer;
	private List<Player> players;

	public BlackJack21(Player dealer, List<Player> players) {
		this.dealer = dealer;
		this.players = players;
	}

	@Override
	public void start() {
		
		// calculate dealer total score
		// to compare with players
		play(dealer);
		
		System.out.println("-----DEALER------");
		displayPlayer(dealer);
		System.out.println(dealer.getName()+" : "+dealer.getTotal());
		System.out.println();
		
		for (Player player : players) {
			play(player);
			System.out.println("------"+player.getName()+" Results------");
			displayPlayer(player);
			System.out.print(player.getName()+" : "+player.getTotal());
			if(player.getCards().size() == 5 && player.getTotal() <= 21) {
				System.out.println(" *beats dealer*");
			}else if(player.getTotal() >= dealer.getTotal() && player.getTotal() <=21) {
				System.out.println(" *beats dealer*");
			}else {
				System.out.println(" *loses*");
			}
			System.out.println();
		}
	}

	@Override
	public void play(Player player) {
		
		int countAceCards = countPlayerAceCards(player);
		int total = sumOfAllNoneAceCards(player);

		if (total <= 7) {
			total += 11 + (countAceCards - 1);
		}else if(total <= 8) {
			total += (countAceCards <= 3)? Ace.alterValue + (countAceCards - 1): countAceCards;
		}else if(total <= 9) {
			total += (countAceCards <= 2)? Ace.alterValue + (countAceCards - 1): countAceCards;
		}else if(total <= 10) {
			total += (countAceCards == 1)? Ace.alterValue : countAceCards;
		}else {
			total += countAceCards;
		}
		player.setTotal(total);
		
	}

}
