import java.util.Scanner;

/*
 * Adhithya Kondalsamy
 * Period: 3
 * Amberg
 * 4/29/16
 * Program that prompts user for a number and displays the numbers 1 through the number 
 * and the sum of the numbers entered by the user
 */
public class NumbersSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		Scanner keyboard = new Scanner(System.in);
		int number, sum = 0, count=1;
		
		//input
		System.out.println("Enter a positive number: ");
		number = keyboard.nextInt();
		//processing
		while(count <= number){
			System.out.println(count);
			count++;
			sum += count;
		}//end while loop
		sum = sum - number;
		System.out.println(sum);
	}//end main

}//end NumbersSum
