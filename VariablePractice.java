import java.util.Scanner;
/*
 * Adhithya Kondalsamy
 * 12/15/15
 * A first attempt using variables
 */
public class VariablePractice {
	public static void main(String[] args) {
		
		//variable declarations
		
		int age;
		Scanner keyboard = new Scanner (System.in); //creating a scanner object for input from keyboard
		
		//assigning values to integers
		
		age = 18;
		
		//displays content of variable age
		
		System.out.println("age: " + age);
		
		//double variable age
		
		age = 2 * age;
		System.out.println("age: " + age);
		//prompt the user for an age
		System.out.print("Enter your age:   ");
		age = keyboard.nextInt();
		System.out.println("Your age is: " + age);
		
		int AgeInTen = age + 10;
		System.out.println("Your age in ten years will be: " + AgeInTen);
		
				
	}//end of main

}//end
