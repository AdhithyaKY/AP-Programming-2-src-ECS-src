/*
 * Adhithya Kondalsamy
 * Period: 6
 * 3/13/17
 * Amberg
 * Code that simulates a tictactoe game.
 */
public class TicTacToe {
	// instance variables (data fields)
	private String[][] board;
	// constants
	private static final int ROWS = 3;
	private static final int COLS = 3;

	// constructor
	// constructs an empty board - filled with blank space Strings
	// as place holders
	public TicTacToe() {
		board = new String[ROWS][COLS];
		for (int row = 0; row < board.length; row++) {
			for (int column = 0; column < board[row].length; column++) {
				board[row][column] = "";
			}
		}
	}

	/*
	 * Sets a field in the board. The field must be unoccupied to be set.
	 * precondition: r is the row value and 0<=r<3, c is column value and 0
	 * <=c<=3, p is the string "X" or "O" postcondition: if the field is
	 * unoccupied, it is set to p otherwise it remains unchanged
	 */
	public void set(int r, int c, String p) {
		if (board[r][c].equals("")) {
			board[r][c] = p;
		}

	}

	/*
	 * Creates a String representation of the board. For example [x O] [ X ] [
	 * O] precondition: none postcondition: returns String representation of the
	 * board
	 */
	public String toString() {
		String col1 = board[0][0] + " | " + board[0][1] + " | " + board[0][2]
				+ "\n------\n";
		String col2 = board[1][0] + " | " + board[1][1] + " | " + board[1][2]
				+ "\n------\n";
		String col3 = board[2][0] + " | " + board[2][1] + " | " + board[2][2];

		return col1 + col2 + col3;
	}

	// calls on private helper methods to perform task
	// checks for a winner or a tie
	// preconditions: none
	// postconditions: if a winner is found returns true, otherwise
	// returns false
	public boolean gameOver() {

		if (checkRows() == true || checkCols() == true
				|| checkDiagonals() == true) {
			return true;
		} else {
			return false;
		}

	}

	// preconditions: none
	// postcondition: returns true if a winner across a row is found
	// otherwise returns false
	private boolean checkRows() {
		for (int i = 0; i < COLS; i++) {
			int count = 1;
			String l = board[0][i];
			if (l != "") {
				for (int x = 1; x < ROWS; x++) {
					if (board[x][i] == l) {
						count++;
					}
				}
			}
			if (count == 3)
				return true;

		}

		return false;
	}

	// precondition: none
	// postcondition: returns true if a winner across a column is found
	// otherwise returns false
	private boolean checkCols() {
		for (int i = 0; i < ROWS; i++) {
			int count = 1;
			String l = board[i][0];
			if (l != "") {
				for (int x = 1; x < COLS; x++) {
					if (board[i][x] == l) {
						count++;
					}
				}
			}
			if (count == 3)
				return true;

		}

		return false;
	}

	// precondition: none
	// postcondition: returns true if a winner across a diagonal is found
	// otherwise returns false
	private boolean checkDiagonals() {
		if (board[0][0] != "" && board[0][0] == board[1][1]
				&& board[0][0] == board[2][2])
			return true;
		else if (board[0][2] != "" && board[0][2] == board[1][1]
				&& board[0][2] == board[2][0])
			return true;
		else
			return false;
	}

	public boolean isTie() {
		for (int x = 0; x < ROWS; x++) {
			for (int y = 0; y < COLS; y++) {
				if (board[x][y] == "") {
					return false;
				}
			}
		}
		return true;
	}

}
