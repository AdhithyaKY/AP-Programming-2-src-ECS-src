import java.util.Scanner;
/*
 * Adhithya Kondalsamy
 * 12/16/15
 * Prompts user for distance of each race segment and display total distance to run
 */
public class DistancePartTwo {
	public static void main(String[] args) {
		double segmentOne, segmentTwo, segmentThree, totalDistance;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter length of segment one here:");
		segmentOne = keyboard.nextDouble();
		System.out.println("Enter length of segment two here:");
		segmentTwo = keyboard.nextDouble();
		System.out.println("Enter length of segment three here:");
		segmentThree = keyboard.nextDouble();
		totalDistance = segmentOne + segmentTwo + segmentThree;
		System.out.println("The total distance of the race is " + totalDistance);
		
	}//end main

}//end 
