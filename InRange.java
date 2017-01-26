import java.util.Scanner;

public class InRange {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] integers = new int[51];

		System.out
				.println("Enter integers >= 0 and <= 50 or enter -1 to quit: ");
		int number = scan.nextInt();

		while (number != -1 && number >= 0 && number <= 50) {
			integers[number]++;
			number = scan.nextInt();
		}

		for (int i = 0; i <= 50; i++) {
			if (integers[i] > 0) {
				System.out.println(i + " : " + integers[i]);
			}
		}

	}//end main
}//end InRange