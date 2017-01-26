/*Adhithya Kondalsamy
 * 5/3/16
 * PercentPassing.java
 * Code that prompts user for a set of grades and outputs the percentage of grades that are above 70%.
 */
import java.util.Scanner;

public class PercentPassing {

	public static void main(String[] args) {
		// variables
		Scanner kb = new Scanner(System.in);
		int grades = 0, count = 0;
		// input
		int passing = 0;
		while (grades != -1) {
			System.out.println("Enter a set of scores or -1 to quit: ");
			grades = kb.nextInt();
			count++;
			if (grades >= 70)
				passing++;
		}
		if(count==1)
			System.out.println("No Passing Scores");
		else{
		System.out.println(((double) passing / (count - 1) * 100)
				+ "% of the scores are passing");
		}
		}//end main

}// end PercentPassing