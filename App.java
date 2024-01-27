package week06FinalCodingProject;

public class App {

	public static void main(String[] args) {

		
		// Instantiate a Deck and two Players, call the shuffle method on the deck.
		// new deck instance of Deck
		Deck deck = new Deck(); 
		
		System.out.println(" ------------------------");
		System.out.println(" ****** WELOCME TO ******");
		System.out.println(" *** THE GAME OF WAR! ***");
		System.out.println(" ------------------------");
		
		System.out.println("\nNew Game:");
		System.out.println("---------\n");
		deck.shuffle();					
		
		// Set player names
		Player playerOne = new Player();
		Player playerTwo = new Player();
		
		
		// Dealing the deck
		// Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				playerOne.draw(deck);
			} else {
				playerTwo.draw(deck);
			}
		}
		
		
	// Using a traditional for loop, iterate 26 times and call the flip method for each player.
		
		for (int i = 0; i < 26; i++) {
			System.out.print("Player 1: ");
			Card flippedCard1 = playerOne.flip();
			System.out.print("Player 2: ");
			Card flippedCard2 = playerTwo.flip();
			
			
			// If statement to determine winner of hands
			
			if (flippedCard1.getValue() > flippedCard2.getValue()){
				playerOne.incrementScore();
				System.out.println("Player 1 wins\n");
			} else if (flippedCard2.getValue() > flippedCard1.getValue()) {
				playerTwo.incrementScore();
				System.out.println("Player 2 wins.\n");
			} else {
				System.out.println("Draw: no points awarded.\n");
			}
			
		}
		
		// If statement to determine winner of War Game
		
		if (playerOne.getScore() == playerTwo.getScore()) {
			System.out.println("\n-- The game is a Draw --");
		} else if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("\n-- Player 1 wins WAR! --");
		} else {
			System.out.println("\n-- Player 2 wins WAR! --");
		}
		
		System.out.println("\n-----------------");
		System.out.print("** GAME RESULTS **");
		System.out.println("\n-----------------");
		System.out.println("Player 1 Final Score: " + playerOne.getScore());
		System.out.println("Player 2 Fianl Score: " + playerTwo.getScore());	
		
	}
}