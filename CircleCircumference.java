import java.util.Scanner;

public class CircleCircumference {
	public static void main(String[] args) {
		double circumference, radius;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		radius = keyboard.nextDouble();
		circumference = radius * Math.PI * 2;
		if (radius < 0) 
			System.out.println("negative radii are illegal");
		else
			System.out.println("The circumference of the circle is: "
					+ circumference);

	}
}
