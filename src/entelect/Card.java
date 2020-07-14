package entelect;

/**
 * @author Mothusi Molorane
 */
public class Card {

	private final String name;
	private final CardType cardType;
	private CardColor cardColor;
	private String fullName;
	private Byte value;

	public Card(String name, CardType cardType) {
		this.name = name;
		this.setValue(name);
		this.cardType = cardType;
		this.initCardColor(cardType);
		this.initFullName();
	}

	private void initCardColor(CardType cardType) {
		switch (cardType) {
			case SPADES:
			case CLUBS:
				this.cardColor = CardColor.BLACK; break;
			default:
				this.cardColor = CardColor.RED;
		}
	}

	private void initFullName() {
		StringBuilder fullName = new StringBuilder();
		switch (name) {
			case "A":	fullName.append("Ace");break;
			case "2":	fullName.append("Two");break;
			case "3":	fullName.append("Three");break;
			case "4":	fullName.append("Four");break;
			case "5":	fullName.append("Five");break;
			case "6":	fullName.append("Six");break;
			case "7":	fullName.append("Seven");break;
			case "8":	fullName.append("Eight");break;
			case "9":	fullName.append("Nine");break;
			case "10":	fullName.append("Ten");break;
			case "K":	fullName.append("King");break;
			case "Q":	fullName.append("Queen");break;
			case "J":	fullName.append("Jack");break;
		}
		
		fullName.append(" of ");

		switch (cardType) {
			case DIAMONDS:	fullName.append("Diamonds");break;
			case HEARTS:	fullName.append("Hearts");break;
			case CLUBS:	fullName.append("Clubs");break;
			case SPADES:	fullName.append("Spades");break;
		}
		this.fullName = fullName.toString();
	}

	public final void setValue(String name) {
		String jqk = "JQK";
		if (name.equalsIgnoreCase("A")) {
			this.setValue((byte) 1);
		} else if (jqk.contains(name)) {
			this.setValue((byte) 10);
		} else {
			this.setValue(Byte.parseByte(name));
		}
	}

	@Override
	public boolean equals(Object obj) {
		Card card = (Card) obj;

		return getName().equals(card.getName()) && getValue().equals(card.getValue())
				&& getCardType().equals(card.getCardType());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + (name == null ? 0 : name.hashCode());
		hash = 31 * hash + (value == null ? 0 : value.hashCode());
		return hash;
	}

	public String getName() {
		return name;
	}
	
	public String getFullName() {
		return this.fullName;
	}


	public Byte getValue() {
		return value;
	}
	
	public void setValue(Byte value) {
		this.value = value;
	}


	public CardColor getCardColor() {
		return cardColor;
	}

	
	public CardType getCardType() {
		return cardType;
	}
}
