import java.util.Scanner;


public class DigitsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		int number, sum = 0, digit;
		Scanner keyboard = new Scanner(System.in);
		do{
			System.out.println("Enter a non-negative number: ");
			number = keyboard.nextInt();
		}while(number< 0);
		while (number > 0)
		{
		  digit = number%10;
		  sum += digit;
		  number /= 10;
		 }
		System.out.println(sum);
	}

}
