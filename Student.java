import java.util.ArrayList;

public class Student {
	// instance variables
	private String firstName, lastName;
	private int id;
	private ArrayList<String> schedule;

	// constructor
	public Student(String fn, String ln, int id) {
		firstName = fn;
		lastName = ln;
		this.id = id;
		schedule = new ArrayList<String>();
	}

	// mutator methods
	public void addCourse(String c) {
		schedule.add(c);
	}

	// accessor
	public String getSchedule() {
		return schedule.toString();
	}

	public String toString() {
		return lastName + ", " + firstName + ": " + id;
	}

}// end of student

