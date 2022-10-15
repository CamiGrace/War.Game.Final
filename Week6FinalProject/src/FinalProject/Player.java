package FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	int score;
	String name;
	List<Card> hand = new ArrayList<Card>();
	
	public Player (String name) {
		this.score=0;
		this.name = name;
	}
	//prints out information about the player and calls the describe method for each card in the Hand List
	public void describe() {
		System.out.print("Player" + this.name);
		System.out.println(this.name + "score");
		System.out.println("player's hand:");
		for (Card card: hand) {
			card.describe();
		}
		System.out.println();
	}
	//removes and returns the top card of the Hand
	public Card flip (List<Card> hand) {
		Card topCard = new Card ();
		topCard= hand.get(0);
		hand.remove(0);
	return topCard;
	}
	// calls on the draw method in Deck to allow the player to draw from the deck and add the card to their hand
	public void draw (Deck deck) {
		Card newCard = new Card(); 
			if ((newCard = deck.draw(deck.cards)) !=null){
				this.hand.add(newCard);
			} else {
				System.out.println("the deck is empty");
			}
		
		
	}
	// creates a method to increase each players score
	public void incrementScore() {
		this.score++;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
}
