import java.util.Scanner;


public class TimeConverter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a time in hours: ");
		double hours = keyboard.nextDouble();
		System.out.println("Enter a time in minutes: ");
		double minutes = keyboard.nextDouble();
		System.out.println("Enter a time in seconds: ");
		double seconds = keyboard.nextDouble();
		
		double totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
		System.out.println("The total amount of time in seconds is: " + totalSeconds);
	}

}
