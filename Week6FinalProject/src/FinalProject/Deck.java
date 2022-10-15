package FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	 List<Card> cards = new ArrayList<Card>();
	public Deck () {
		
		// set the suit and face value to cards 
			String[] name = {"Diamonds", "Hearts","Clubs", "Spades"};
			String [] value = {"Two", "Three", "Four", "Five","Six", "Seven", 
					"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
			
		//populate the cards List (Deck) with all possible combinations of the two traits
			for (int i=0; i< value.length; i++) {
			 for (int x=0; x< name.length; x++) {
				 Card newCard = new Card();
				 newCard.setName( value[i] + " of " + name[x]);
				 newCard.setValue(i);
				 cards.add(newCard);
			 }
			}
	
	}
	
	
	//randomize cards 
	public void shuffle () {
		Collections.shuffle(cards);
 }
			
			
		
	// the top card of deck is removed from deck 
	public Card draw (List<Card> cards) {
			Card topCard = new Card();
			if (cards.size()== 0) {
				System.out.println("There are no cards left in the deck ");
				return null;
			} else {
				topCard = cards.get(0);
				cards.remove(0);
				return topCard;
				 
			}
		
	} 
	}
	



