import java.text.NumberFormat;
import java.text.DecimalFormat;
public class FormattingExample {

	public static void main(String[] args) {
		//variables
		double dollars = 21.5;
		double taxRate = 0.06;
		double num1 = .569999999;
		double num2 = 13.3;
		double num3 = .6;
		
		/*
		 * The following is covered on page 86 of textbook:
		 * getCurrencyInstance() method is used to create a currency format
		 * getPercentInstance() method is used to create a percent format
		 */
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		/*
		 * DecimalFormat sets a pattern for numeric output
		 * 
		 * 0 forces a number to be in that position
		 * "0.00" as least one digit to the left of decimal point and two
		 * to the right will be shown
		 * 
		 * The symbol # is used to round but doesn't force a place
		 * to be shown.
		 */
		
		DecimalFormat twoPlaces = new DecimalFormat("0.00");
	    DecimalFormat rounding = new DecimalFormat(".##");
		
		System.out.println(money.format(dollars));
		System.out.println(percent.format(taxRate));
		System.out.println(rounding.format(num1));
		System.out.println(rounding.format(num2));
		System.out.println(rounding.format(num3));
		
	}

}
