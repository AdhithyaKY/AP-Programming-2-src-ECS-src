/*
 * Adhithya Kondalsamy
 * 12/8/16
 * Amberg
 * Code that creates two player objects, makes them 
 * compete in a game of Nim, and outputs the winner. 
 */
import java.util.Scanner;

public class Nim {

	public static String player1Name, player2Name;

	public static void main(String[] args) {
		//variables
		int playerTurn;
		int player2Type;
		int player1Type;
		boolean winner = false;
		Scanner keyboard = new Scanner(System.in);
		// make a pile of marbles a random
		// number from 10-100 inclusive
		Pile p1 = new Pile((int) (91 * Math.random() + 10));
		System.out.println("There are " + p1.getMarbles() + " number of "
				+ "marbles in the pile to start.");

		// makes 2 players
		// player 1
		System.out.println("Creating Player 1.");
		System.out.println("Enter a name for the" + " player:");
		player1Name = keyboard.next();
		System.out.println("Enter the player type for player 1: ");
		player1Type = keyboard.nextInt();

		// player 2
		System.out.println("Creating opponent.");
		System.out.println("Enter difficulty: " + "Beginner(0) Expert(1)");
		player2Type = keyboard.nextInt();
		player2Name = "Computer";

		// make the 2 player objects
		NimPlayer player1 = new NimPlayer(player1Type, player1Name);
		NimPlayer player2 = new NimPlayer(player2Type, player1Name);

		// BEGIN GAME------------------------
		// generates number between 0 and 1
		// decides which player goes first
		int goFirst = (int) ((Math.random() *2));

		if (goFirst == 0) {
			System.out.println(player1Name + " goes first!");
		} else
			System.out.println(player2Name + " goes first!");

		playerTurn = goFirst;
		// turns-------------------
		// runs while there is no winner
		while (!winner) {
			if (playerTurn == 0) {// first player
				System.out.println("-----" + "----------");
				System.out.println(player1Name + "'s TURN");
				System.out.println("Number of " + "marbles in the pile: "
						+ p1.getMarbles());
				player1.removeMarbles(p1);
				System.out.println("Number of " + "marbles in pile after"
						+ " player 1 removed: "
						+ p1.getMarbles());
				winner = isWinner(p1, playerTurn);
				playerTurn = 1;
				// end player1 turn
				// begin player2 turn

			} else {// 2nd player(computer)
				System.out.println("--" + "-------------");
				System.out.println(player2Name + "'s TURN");
				int startMarbles = p1.getMarbles();
				player2.removeMarbles(p1);
				int endMarbles = p1.getMarbles();
				int difference = startMarbles - endMarbles;
				if(p1.getMarbles() > 1){
				System.out.println("Computer has removed " +  difference
						+ " marbles.");
				System.out.println("Current amount of marbles"
						+ " in bag: " + p1.getMarbles());
				}else{
					System.out.println();
				}
				winner = isWinner(p1, playerTurn);
				playerTurn = 0;
				// end player1 turn
				// begin player2 turn
			}
		}

		System.out.println("End");

	}// end of main

	// method to see if there is a
	// winner (one marble left)
	public static boolean isWinner(Pile p1, int playerTurn) {
		if (playerTurn == 0 && p1.getMarbles() == 1) {
			System.out.println(player1Name + " won");
			return true;
		} else if (playerTurn == 1 && p1.getMarbles() == 1) {
			System.out.println(player2Name + " won");
			return true;
		} else
			return false;
	}// end of isWinner, stop the program

}// end of Nim