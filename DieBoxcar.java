/*
 * Adhithya Kondalsamy
 * Period: 6
 * Amberg
 * 11/15/16
 * Code that creates 2 die objects, rolls them 1000 times, prints out the number
 * of times both dice have face values of 6, and prints out a string representing
 * the current face values of each die at the end.
 */
public class DieBoxcar {
	public static void main(String[] args) {
		// variables
		PairOfDice pair = new PairOfDice();
		int count = 0;

		for (int x = 0; x < 1000; x++) {
			pair.roll();

			if (pair.getFaceValue1() == 6 && pair.getFaceValue2() == 6) {
				count++;
			}
		}// end for loop
		// output
		System.out.println(count);
		System.out.println(pair.toString());
	}// end main
}// end DieBoxcar