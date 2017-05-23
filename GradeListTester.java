import java.text.NumberFormat;

/*
 * Written to test the implementation of the GradeList class
 *
 */
public class GradeListTester {

	public static void main(String[] args) {

		// variables
		int[] a = { 77, 102, -8, 94, -99, 110, 80, 60, 92, -8 };
		GradeList list1 = new GradeList(a);
		double average = 0.0;
		NumberFormat percent = NumberFormat.getPercentInstance();

		// test each method and output results
		System.out.println("original GradelList");
		System.out.println(list1);

		// gradeLimit test
		list1.gradeLimit(100);
		System.out.println("\n After gradeLimit set to 100");
		System.out.println(list1);

		// average with negatives
		System.out.println("average with negatives");
		average = list1.average();
		System.out.println("Average of all grades = " + average);
		// averageWithoutLowest test
		average = list1.averageWithoutLowest();
		System.out.println("Average without lowest grade with negatives = " + average);
		// removeNegatives test
		list1.removeNegatives();
		System.out.println("\n After removeNegatives");
		System.out.println(list1);

		// average test
		average = list1.average();
		System.out.println("Average of all grades = " + average);

		// averageWithoutLowest test
		average = list1.averageWithoutLowest();
		System.out.println("Average without lowest grade = " + average);

	}// end main

}// end GradeListTester
