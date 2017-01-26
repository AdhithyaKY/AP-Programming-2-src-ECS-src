import java.util.Scanner;

/*
 * Adhithya Kondalsamy
 * Amberg
 * Period: 3
 * 4/28/16
 * 
 */
public class Prompter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min, max, middleNumber;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the minimum number: ");
		min=keyboard.nextInt();
		System.out.println("Enter the maximum number: ");
		max=keyboard.nextInt();
		
		do{
			System.out.println("Enter a number in between the two values: ");
			middleNumber = keyboard.nextInt();
		}while(min > middleNumber || max < middleNumber);
		System.out.println("The number is within the range");
		
	}//end main

}//end Prompter
