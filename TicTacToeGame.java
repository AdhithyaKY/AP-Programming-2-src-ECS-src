import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int moves = 0;
		String playerLetter;
		int column;
		int row;
		boolean player1Turn = true;
		TicTacToe gameBoard = new TicTacToe();

		while (gameBoard.gameOver() != true && gameBoard.isTie() == false) {
			System.out.println(gameBoard);
			if (player1Turn == true) {
				System.out.println("Player 1 Turn:");
				playerLetter = "X";
			} else {
				System.out.println("Player 2 Turn");
				playerLetter = "O";
			}
			System.out.println("Type in row value:");
			row = keyboard.nextInt();
			System.out.println("Type in column value:");
			column = keyboard.nextInt();
			gameBoard.set(row, column, playerLetter);
			if (player1Turn == true) {
				player1Turn = false;
			} else
				player1Turn = true;

			moves++;
		}
		System.out.println(gameBoard);
		if (gameBoard.isTie() == true && gameBoard.gameOver() == false)
			System.out.println("Tie Game");
		else {
			if (player1Turn == false)

				System.out.println("Player 1 wins!");
			else
				System.out.println("Player 2 wins!");
		}
	}

}