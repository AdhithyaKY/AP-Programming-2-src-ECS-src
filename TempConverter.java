import java.util.Scanner;
/*Adhithya Kondalsamy
 * 1/8/16
 * Converts an inputted temperature from fahrenheit to celsius.
 */
public class TempConverter {
	public static void main(String[] args) {
		double FahrenheitTemp, CelsiusTemp;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter Temperature in Fahrenheit: ");
	    FahrenheitTemp = keyboard.nextDouble();
	    CelsiusTemp = ((double)5/9*(FahrenheitTemp-32));
	    System.out.println("The temperature in Celsius is "+ CelsiusTemp);
	    
	}//end main

}//end class
