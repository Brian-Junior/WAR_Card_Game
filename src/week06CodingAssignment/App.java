package week06CodingAssignment;

public class App {
// adding players name
	public static void main(String[] args) {
		Player player1 = new Player("Brian");
		Player player2 = new Player("Joe");
		Deck deck = new Deck();
		deck.shuffle();
		
	//adding cards to each hand	
		
		for (int i = 1; i <= 26; i++) {
			player1.hand.add(deck.draw());
			player2.hand.add(deck.draw());			
		}
		
		player1.discribe();
		player2.discribe();
		
		// the flip showing each game played
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip(); 
			Card player2Card = player2.flip();
			
			System.out.println(player1.name +" "+ player1.getScore());
			System.out.println(player2.name +" "+ player2.getScore());
			
			System.out.print(player1.name +" card is ");
			player1Card.discribe();
			System.out.println();
			System.out.print(player2.name + " card is ");
			player2Card.discribe();
			System.out.println("--------------------------------");
			
			// increments score for each game
			
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			}else if (player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();
			}else
				System.out.println();					
				
		}
		// Gives final score
	
		if(player1.score > player2.score) {
			System.out.println("Brian is the winner!");
			System.out.println("With a score of " + player1.score +" To "+ player2.score + "!");
			
		}else if (player2.score > player1.score) {
			System.out.println("Joe is the winner!");
			System.out.println("With a score of " + player2.score +" TO "+ player1.score + "!");
		}else {
			System.out.println("Draw");
		}
	
	}
	
}
