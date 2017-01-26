import java.util.Scanner;


public class AverageNumbers {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type in the 3 numbers: ");
		int numberOne = keyboard.nextInt();
		int numberTwo = keyboard.nextInt();
		int numberThree = keyboard.nextInt();
		double average = (numberOne + numberTwo + numberThree)/3;
		System.out.println("The average of the three number is " +average);
	}
}
