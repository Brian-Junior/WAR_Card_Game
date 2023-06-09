package week06CodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
// Are list of cards making the hand
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	// Are player constructor
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void discribe() {// The method for showing or describing the cards
		System.out.println(name + " has the following cards : ");
		for (Card card : hand) {
			card.discribe();
		}
		System.out.println("---------------------------------------------");
	}
	
	public Card flip() {// flips shows then removes the card
		Card drawTopCard = hand.get(0);
		hand.remove(0);
		return drawTopCard;
	}
	
	public void draw (Deck deck) { //draws a card from the deck
		Card card = deck.draw();
		hand.add(card);
	}
	
	public void incrementScore() {// Increases score with every win
		this.score++;
	}
	
	public int getScore() {//gets the score
		return score;
	}
	
}

