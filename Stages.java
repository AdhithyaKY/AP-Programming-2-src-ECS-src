/*
 * Adhithya Kondalsamy
 * 4/7/16
 * Period: 3
 * Code that uses age to display an accepted label for that age group.
 */
import java.util.Scanner;


public class Stages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		int age;
		//input
		Scanner keyboard = new Scanner (System.in);
		//processing
		System.out.println("Enter your age: ");
		age = keyboard.nextInt();
		//output
		if (age > 18)
			System.out.println("adult");
		else if (age <=5)
			System.out.println("toddler");
		else if (age <=10)	
			System.out.println("child");
		else if (age <=12)
			System.out.println("preteen");
		else if (age >12)
			System.out.println("teen");
	}//end main

}//end Stages
