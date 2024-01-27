package week06FinalCodingProject;

public class Card {

	// Declared variables
	private String name;  // ("Nine of Hearts")
	private int value;	// the number the card represents "9"
	
	
	// Constructor for Card class with two parameters, Sting & int)
	
	Card(String name,int value) {
		this.name = name;
		this.value = value;
	}
	
	
	// Getters and Setters
	
	public String getName() {
		return name;
	} 
	
	
	public int getValue() {
		return value;
	} 
	
	

	// Describe method 
	public void describe() {
		System.out.println(this.name + " -- " + this.value);
	}
}
