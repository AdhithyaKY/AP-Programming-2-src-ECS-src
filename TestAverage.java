import java.util.Scanner;

/*
 * This program will read in test scores until user enters sentinel value
 * it will accumulate the sum of scores and display the average of scores
 */
public class TestAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int score=0, sum=0, count=0;
		double average=0;
		//prompt the user for the first score(because there may be none)
		System.out.print("enter a test score or -1 to quit: ");
		score = keyboard.nextInt();
		
		//while the value is not the sentinel, continue to accumulate
		while(score != -1){
			//count the test
			count++; //makes count go up by 1
		
			//accumulate the value of the test into sum
			sum += score;//accumulator
			//prompt for another score
			System.out.print("enter a test score or -1 to quit: ");
			score = keyboard.nextInt();
		}
		//calculate the average
		average = (double)sum/count;
		//display the average
		System.out.println("average is " + average);
	}

}
