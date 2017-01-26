import java.util.Scanner;


public class LogicalOperatorPractice {
	public static void main(String[] args) {
		 
		//variables
		Scanner keyboard = new Scanner(System.in);
		int guess, answer;
		//input
		System.out.println("Guess a number from 1 to 10: ");
		guess = keyboard.nextInt();
		//processing & output
		answer = (int) (10 * Math.random() + 1);
		if (guess < 1 || guess > 10){
			System.out.println("out of range - FOLLOW DIRECTIONS");
		}
		else if (guess == answer)
				System.out.println("You guessed it!");
		
		else if (guess < answer)
				System.out.println("too low");
		
		else 
				System.out.println("too high");
		 
	}
}

