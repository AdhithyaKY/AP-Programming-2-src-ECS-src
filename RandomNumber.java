/*
 * Adhithya Kondalsamy
 * 4/12/16
 * Program that asks for a range of numbers and displays a random number from that range.
 * Amberg
 */

import java.util.Scanner;
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		int minimumValue, maximumValue, randInt;
		Scanner value = new Scanner(System.in);
		//input
		System.out.println("Enter the maximum value: ");
		maximumValue = value.nextInt();
		System.out.println("Enter the minimum value: ");
		minimumValue = value.nextInt();
		//processing
		randInt =(int) ((maximumValue - minimumValue + 1) * Math.random() + 1);
		//output
		System.out.println(+ randInt);
	}//end main

}//end RandomNumber
