package week06CodingAssignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	  List<Card> cards = new ArrayList<Card>();

	  Deck(){//array list of card builder
		  String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		  String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
				  				"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		  
		  for(String suit : suits) {//creates each card then adds the value to it
			  int count = 2;
			  for (String number : numbers) {
				  Card card = new Card (number, suit, count);
				  this.cards.add(card);
				  count++;
			  }
		  }
	  }

	public List<Card> getCards() {//gets the list of cards
		return cards;
	}

	public void setCards(List<Card> cards) { // sets the list of cards
		this.cards = cards;
	}
	  
	  
	  public void discribe() { //Describes all cards
		  for (Card card : this.cards) {
			  card.discribe();
		  }
	  }
	  public void shuffle() {// shuffles all cards
		  Collections.shuffle(this.cards);
	  }
	  public Card draw() {//draws first card
		  Card card = this.cards.remove(0);
		  return card;
	  }
}
