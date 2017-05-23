/*
 * Adhithya Kondalsamy
 * Period: 6
 * Amberg
 * 2/1/17
 * Code that manipulates grade values and finds the average after manipulations.
 */
public class GradeList {

	// instance fields
	private int[] grades; // store numeric grade values

	// receives an array of integers used to construct the grades field
	public GradeList(int[] g) {
		grades = g;
	}

	// override toString to return the contents of the grades array
	// as a string
	public String toString() {
		String s = "[ ";
		for (int x : grades)
			s += x + "\t";
		s += " ]";
		return s;
	}

	// changes values in grade that are above the limit to the limit
	// precondition: grades contains at least 1 value
	// postcondition: returns the count for the number of values changed
	public int gradeLimit(int limit) {
		int count = 0;
		if (grades.length >= 1) {
			for (int x = 0; x < grades.length; x++) {
				if (grades[x] > limit) {
					grades[x] = limit;
					count++;
				}
			}
		}
		return count;
	}// end gradeLimit
		// removes all negatives values from grades
		// precondition: grades contains at least 2 values
		// postcondition: the length of grades reflects the removal of negative
		// values

	public void removeNegatives() {
		int positives = 0;
		if (grades.length >= 2) {
			for (int x = 0; x < grades.length; x++) {
				if (grades[x] >= 0)
					positives++;
			}

			int[] tempArray = new int[positives];
			int index = 0;
			for (int x = 0; x < grades.length; x++) {
				if (grades[x] >= 0) {
					tempArray[index] = grades[x];
					index++;
				}

			}
			grades = tempArray;
		}

	}// end removeNegatives
		// calculates the average without including the lowest value
		// precondition: grade contains at least 2 values
		// postcondition: returns the average of all the numbers not
		// including the lowest value as a floating point value

	public double averageWithoutLowest() {
		int min = findLowestIndex();
		int sum = 0;
		double average = 0.0;
		if (grades.length >= 2) {
			for (int x = 0; x < grades.length; x++) {
				sum += grades[x];
			}
			sum -= min;
			average = (double) sum / (grades.length - 1);

		}
		return average;
	}

	// calculates the average of all grades in grades
	// precondition: at least 2 values in grades
	// postcondition: returns the real number average of the values in grades
	public double average() {
		double average = 0.0;
		int sum = 0;
		if (grades.length >= 2) {
			for (int x = 0; x < grades.length; x++) {
				sum += grades[x];
			}
			average = (double) sum / (grades.length);
		}
		return average;

	}// end average
		// finds and returns the index of the lowest value in grades
		// and returns that index for use in averageWithoutLowest
		// precondition: at least 2 values in grades
		// postcondition: returns the index of the lowest value in the array

	private int findLowestIndex() {
		int min = grades[0];
		for (int x = 0; x < grades.length; x++) {
			if (grades[x] < min) {
				min = grades[x];
			}
		}
		System.out.println(min);
		return min;
	}// end findLowestIndex
}// end GradeList

