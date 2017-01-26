import java.util.Scanner;

/*
 * Adhithya Kondalsamy
 * Period: 3
 * Amberg
 * 5/6/16
 * Code that prompts user for his or her name and displays an appropriate greeting.
 */
public class FormalGreeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		Scanner keyboard = new Scanner(System.in);
		String fullName;
		//input
		System.out.print("Enter your full name, including title: ");
		fullName = keyboard.nextLine();
		keyboard.close();
		//processing and output
		if  ((fullName.startsWith("Ms.")) || (fullName.startsWith("Mrs.")) || (fullName.startsWith("Miss")) ){
			System.out.println("Hello, ma'am.");
		} else if (fullName.startsWith("Mr.")) { 
			System.out.println("Hello, sir.");
		} else
			System.out.println("Hello, " + fullName + ".");
	}//end main
	
}//end FormalGreeting