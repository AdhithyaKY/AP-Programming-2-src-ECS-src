/*
 * Adhithya Kondalsamy
 * Mrs. Amberg
 * Period: 3
 * Code that displays random math questions, processes the users' answer, and outputs 
 * whether the user was correct or incorrect.
 */
import java.util.Scanner;
public class MathTutor {
	public static void main(String[] args) {
		//variables
		Scanner keyboard = new Scanner(System.in);
		int number1, number2, answer, actualAnswer=0, operator;
		//processing
		number1 = (int) (10 * Math.random() + 1);
		number2 = (int) (10 * Math.random() + 1);
		
		operator = (int) (4 * Math.random() + 1);
		
		
		if(operator == 1)
			System.out.println("What is " + number1  + "/" +  number2 + "?");
		else if(operator == 2)
			System.out.println("What is " + number1  + "+" +  number2 + "?");
		else if(operator == 3)
			System.out.println("What is " + number1  + "-" + number2 + "?");
		else if(operator == 4) 
			System.out.println("What is " + number1  + "*" + number2 + "?");
		
		if(operator == 1)
			actualAnswer = number1 / number2;
		else if(operator == 2)
			actualAnswer = number1 + number2;
		else if(operator == 3)
			actualAnswer = number1 - number2;
		else if(operator == 4) 
			actualAnswer = number1 * number2;
		
		
		//input
		System.out.println("What is the answer? ");
		answer = keyboard.nextInt();
		
		//output
		if(answer == actualAnswer)
			System.out.println("Correct");
		if(answer != actualAnswer)
			System.out.println("Wrong");
	}
}
