/*
 * Adhithya Kondalsamy
 * Period: 3
 * Amberg
 * 5/27/16
 * Code that displays the average number of steps it takes for person to walk in order to fall of a bridge.  It also 
 * displays the greatest number of steps the person takes.
 */
public class RandomWalk {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variables
		int randomStep, count = 0, sum = 0, average, greatestSteps=0;
		double start = 3.5;
		for (int trial = 1; trial <= 50; trial++) {
			while (start <= 7 && start >= 0) {
				randomStep = (int) (2 * Math.random() + 0);
				if (randomStep == 0)
					start += 1;
				else {
					start -= 1;
				}

				count++;

			}
			if(count > greatestSteps){
				greatestSteps = count;
			}
			sum += count;
			count = 0;
			start = 3.5;
		}
		average = sum / 50;
		System.out.println("The average number of steps is : " + average);
		System.out.println("The greatest number of steps taken is : " +greatestSteps);
		
	}

}
