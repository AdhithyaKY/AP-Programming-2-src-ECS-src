/*
 * Adhithya Kondalsamy
 * Period: 3
 * Amberg
 * 5/13/16
 * Program that outputs a table listing celsius temperatures from 0 to 100 and their 
 * corresponding temperatures in fahrenheit.
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class TemperatureConverter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//output
		DecimalFormat onePlace = new DecimalFormat("0.0");
		System.out.println("Celsius\t Fahrenheit");
		for(int c=0; c <= 100; c++){
			double f=c*(1.8)+32;
		System.out.println(c+ "\t    " +	(onePlace.format(f)));
		}//end for loop
		
		
		
	}//end main

}//end TemperatureConverter
