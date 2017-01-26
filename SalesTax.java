import java.text.NumberFormat;
import java.util.Scanner;

/*Adhithya Kondalsamy
 * 1/8/16
 * Will calculate the sales tax and final cost of a purchase
 */

public class SalesTax {
	public static void main(String[] args){
		
		//variables
		double price, salesTax, totalPrice;
		Scanner kb = new Scanner(System.in);
		
		//constants
		final double TAX_RATE = .06;
		
		//formatting variables
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		
		//get input
		System.out.println("Please type in the price ...");
		price = kb.nextDouble();
		
		//calculations
		salesTax = price * TAX_RATE;
		totalPrice = price + salesTax;
		
		//output
		System.out.println("Tax rate is: "+percent.format(TAX_RATE));
		System.out.println("The tax is: "+ money.format(salesTax));
		System.out.println("The total price is: "+ money.format(totalPrice));
	}//end main

}//end class
