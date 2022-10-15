package FinalProject;

public class App {

	public static void main(String[] args) {
		
		
		//Instantiate a Deck and two Players, call the shuffle method on the deck.
		 Deck deck = new Deck();
		 deck.shuffle();
		 
		
		Player player1 = new Player("Jane");
		
		Player player2 = new Player("Tarzan");
		
	// Using a traditional for loop, iterate 52 times calling the Draw method on the other player 
		//each iteration using the Deck you instantiated.	
	
		for (int i=0; i<52;i++) {
		if (i%2 ==0) {
			player1.draw(deck);
		} else {
			player2.draw(deck);
		}
	}
		
		Card topCardPlayer1 = new Card();
		Card topCardPlayer2 = new Card();
		
		int round =1;
		//Using a traditional for loop, iterate 26 times and call the flip method for each player.
		for (round=1; round <=26; round++) {
		
			System.out.println("********************");
			System.out.println("Round:" + round);
			topCardPlayer1 = player1.flip(player1.hand);
			System.out.println(player1.name +": "  + topCardPlayer1.describe()); 
			System.out.println("        vs         ");
			topCardPlayer2 = player1.flip(player2.hand);
			System.out.println(player2.name +": "  +topCardPlayer2.describe());
			System.out.println();
			//show the winner of each round the increment the score 
			if (topCardPlayer1.getValue()> topCardPlayer2.getValue()) {
				player1.incrementScore();
				System.out.println("Round " + round +" winner: " + player1.name  + " gets a point!");
				System.out.println();
			
			} else if (topCardPlayer2.getValue()> topCardPlayer1.getValue()) {
				player2.incrementScore();
				System.out.println("Round " + round +" winner: " +player2.name + " gets a point!");
				System.out.println();
			}else {
				System.out.println("It's a draw...NO POINTS!");
				System.out.println();
			}// show updated scores each round 
			System.out.println("The score is now " + player1.getScore() + " to " + player2.getScore());
			System.out.println();
		}// reveal the winner at the end of game 
		System.out.println("***THE GAME IS OVER***");
		System.out.println();
		String winner = endOfGame(player1, player2);
				 System.out.println("The winner is " + winner);
	}	
			


		// end of game
		// Compare scores and determine the winner 
		private static String endOfGame (Player player1, Player player2) {
			int player1score = player1.getScore();
			int player2score = player2.getScore();
			
			System.out.println(player1.getName() +" final score: " + player1score);
			System.out.println(player2.getName() +" final score: " + player2score);
		if (player1score> player2score) {
			return player1.name;
		} else if (player1score< player2score) {
			return player2.name;
		}else {
			return "Nobody: It's a draw";
		}

		
}
}