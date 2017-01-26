import java.util.Scanner;
/* Adhithya Kondalsamy
 * 1/8/16
 * Calculates average of 5 grades that are inputted.
 */
public class GradeAverage {
	public static void main(String[] args) {
		int GradeOne, GradeTwo, GradeThree, GradeFour, GradeFive, total;
		double Average;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter grade 1: ");
	    GradeOne = keyboard.nextInt();
		System.out.print("Enter grade 2: ");
		GradeTwo = keyboard.nextInt();
		System.out.print("Enter grade 3: ");
		GradeThree = keyboard.nextInt();
		System.out.print("Enter grade 4: ");
		GradeFour = keyboard.nextInt();
		System.out.print("Enter grade 5: ");
		GradeFive = keyboard.nextInt();
		total = GradeOne + GradeTwo + GradeThree + GradeFour + GradeFive;
		Average = total/5.0;
		System.out.println("Your Average Grade is: " + Average);
		 
		
	}//end main

}//end class
