package week06FinalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {

	// Declaring List of hand, int, score, and String, name
	
	private List<Card> hand;
	private int score;
	private String name;
	
	
	
	// Getters and Setters
	public int getScore() {
		return score;
	}                                            

	public void setScore(int score) {
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}                                            

	public void setName(String name) {
		this.name = name;
	}
	
	

	// Constructor
	
	public Player() {
		score = 0;                     // Set score to 0
		hand = new ArrayList<Card>();       // initialized hand variable to set up empty list to store Card objects
	}
	
	
	
	// Methods 
	
	public void describe() {
		System.out.println(name + "'s score is: " + score);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	
	public Card flip() {
		//return hand.remove(0);
		Card someCard = hand.remove(0);
		someCard.describe();
		return someCard;
	}
	
	
	public void draw(Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
	
	public void incrementScore() {
		score++;
	}
	
}	