/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entelect;

/**
 * @author Mothusi Molorane
 */
public class Card {

	private String name;
	private Byte value;
	private CardType cardType;
	private CardColor cardColor;
	private String fullName;

	public Card(String name, CardType cardType) {
		this.name = name;
		this.setValue(name);
		this.cardType = cardType;
		this.setCardColor(cardType);
		this.setFullName();
	}

	public final void setCardColor(CardType cardType) {
		switch (cardType) {
		case SPADES:
		case CLUBS:
			this.cardColor = CardColor.BLACK;
			break;
		default:
			this.cardColor = CardColor.RED;
		}
	}

	public final void setFullName() {
		String fullName = "";
		switch (name) {
			case "A":fullName += "Ace";break;
			case "2":fullName += "Two";break;
			case "3":fullName += "Three";break;
			case "4":fullName += "Four";break;
			case "5":fullName += "Five";break;
			case "6":fullName += "Six";break;
			case "7":fullName += "Seven";break;
			case "8":fullName += "Eight";break;
			case "9":fullName += "Nine";break;
			case "10":fullName += "Ten";break;
			case "K":fullName += "King";break;
			case "Q":fullName += "Queen";break;
			case "J":fullName += "Jack";break;
		}
		
		fullName += " of ";

		switch (cardType) {
			case DIAMONDS:fullName += "Diamonds";break;
			case HEARTS:fullName += "Hearts";break;
			case CLUBS:fullName += "Clubs";break;
			case SPADES:fullName += "Spades";break;
		}
		this.fullName = fullName;
	}
	
	public String getFullName() {
		return this.fullName;
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
	 * @return the value
	 */
	public Byte getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Byte value) {
		this.value = value;
	}

	/**
	 * @return the cardColor
	 */
	public CardColor getCardColor() {
		return cardColor;
	}

	/**
	 * @param cardColor the cardColor to set
	 */
	public void setCardColor(CardColor cardColor) {
		this.cardColor = cardColor;
	}

	/**
	 * @return the cardType
	 */
	public CardType getCardType() {
		return cardType;
	}

	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
}
