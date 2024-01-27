package week06FinalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

	// Declaring variable named "cards" as a List of Card
	
	List<Card> cards = new ArrayList<Card>();   // Creating list of cards
	
	// Initializing two arrays 
	public Deck() {      
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
						 "Nine", "Ten", "Jack", "Queen", "King", "Ace"};	
	
		
		for (String suit : suits) {    // Enhanced for loop to walk through each array and create a card
			int count = 2;                    // Set a counter to set the value, so we can range value 2 - 14 ("Ace")
			for (String name : names) {     // <<< Nested enhanced for loop - instantiate a new card for each card we want to create
				Card card = new Card(name + " of " + suit, count);
				this.cards.add(card);
				count++;				// Runs through the loop of all suits for all numbers, creating 52 cards
			}
		}
		
	}
	
	// Getters and Setters
	
	public List<Card> getCards() {
		return cards;
	}                                            

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	
	// Methods 
	
	public void shuffle() {
		Collections.shuffle(cards);
		
	} 
	
	public Card draw() {
		return cards.remove(0);
		
	}
	
	
}
	

