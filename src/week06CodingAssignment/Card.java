package week06CodingAssignment;

public class Card {
	String name;
	String suit;
	int value;
	Card(String name, String suit, int value){
		this.name = name; // card type(number- jack queen king ace)
		this.suit = suit; // Diamond heart spade club
		this.value = value; // value of card 2-14
		
	}
	public String getName() { // getting name of card
		return name;
	}
	public void setName(String name) {// set name for card
		this.name = name;
	}
	public String getSuit() {// get the suit
		return suit;
	}
	public void setSuit(String suit) {// set the suit
		this.suit = suit;
	}
	public int getValue() {// get the value
		return value;
	}
	public void setValue(int value) { // set the value
		this.value = value;
	}
	public void discribe() {// Describes the card that is made
		System.out.println(this.name + " of " + this.suit + " -- " + this.value);
	}

}
