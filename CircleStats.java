import java.text.DecimalFormat;
import java.util.Scanner;

/*Example of decimal formatting
 * 
 */
public class CircleStats {

	public static void main(String[] args) {
		
		final double bigNumber = 2E14;
		final double PI = 3.14159;
		double radius, area, circumference;
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the radius of the circle: ");
		radius = scan.nextDouble();
		
		area = PI * radius * radius;
		
		//round to 3 decimal places
		DecimalFormat fmt  = new DecimalFormat("0.###");
		
		System.out.println(fmt.format(area));
		System.out.println(bigNumber);

	}

}
