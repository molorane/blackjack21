package entelect;

/**
 * @author Mothusi MOlorane
 */
public interface Playable {

	void start();
	void play(Player player);
	int winnersCount();
	int playersCount();
	
	default void displayPlayerCards(Player player) {
		for(Card card: player.getCards()) {
			System.out.println(card.getFullName());
		}
	}

	
	default int sumOfAllNoneAceCards(Player player) {
		int sum = 0;
		for (Card card : player.getCards()) {
			if (card instanceof Ace == false)
				sum += card.getValue();
		}
		return sum;
	}

	default int countPlayerAceCards(Player player) {
		int count = 0;
		for (Card card : player.getCards()) {
			if (card instanceof Ace)
				count += 1;
		}
		return count;
	}

}
