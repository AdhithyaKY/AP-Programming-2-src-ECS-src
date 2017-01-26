import java.text.NumberFormat;
import java.util.Scanner;

/*Adhithya Kondalsamy
 * 1/12/16
 * Prompts user for size of pizza and outputs prize of that pizza.
 */
public class PizzaCost {
	public static void main(String[] args) {
		//variables
		double diameter, totalCost;
		//constants
		final double RENT_COST, LABOR_COST, MATERIAL_COST;
		//data formatting
		NumberFormat money = NumberFormat.getCurrencyInstance();
		//user input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter diameter of pizza in inches: ");
		//calculations
		diameter = keyboard.nextDouble();
		RENT_COST = 1.00;
		LABOR_COST = 0.75;
		MATERIAL_COST = 0.05 * diameter * diameter;
		totalCost = LABOR_COST + RENT_COST + MATERIAL_COST;
		//output
		System.out.println("The cost of making the pizza is: "+ money.format(totalCost));
	}//end main

}//end class
