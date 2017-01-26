import java.util.Scanner;


public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		Scanner scan = new Scanner(System.in);
		int score;
		
		//input
		System.out.println("Enter your score (a number 1 to 5):");
		score = scan.nextInt();
		
		switch (score){
		
		case 5: System.out.println("You earned the highest score possible!"); 
		break;
		
		case 4: System.out.println("Good Job!");
		break;
		
		case 3: System.out.println("Fair Job");
		break;
		
		case 2: 
		case 1: System.out.println("You need to do some work.");
		
		default:
				System.out.println(score + " is not a valid entry");
				System.out.println("try again later");
		}//end switch on score
		
		System.out.println("goodbye");
		
	}//end main

}//end SwitchExample
