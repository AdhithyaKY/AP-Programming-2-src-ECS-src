import java.util.ArrayList;
public class StudentTester {

	public static void main(String[] args) {
		Student s1 = new Student("Fred","Flintstone",263);
		System.out.println(s1);
		s1.addCourse("AP Calculus BC");
		s1.addCourse("Child Development 2B");
		
		System.out.println(s1.getSchedule());
		
	}

}
