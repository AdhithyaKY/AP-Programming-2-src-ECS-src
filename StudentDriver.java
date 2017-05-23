
public class StudentDriver {

	public static void main(String[] args) {
		//variables
		int[] tests1 = {62,70,60};
		int[] tests2 = {70, 70,100};
		int[] tests3 = {89,100,100};
		Student st1 = new Student();
		Student st2 = new Student("George", tests1, "?");
		Student st3 = new Student("Greg",tests2,"?");
		
		Undergrad ug1 = new Undergrad();
		
		GradStudent g1 = new GradStudent("SomeGrad", tests1, "?", 234);
		
		System.out.println(st1.getTestAverage());
		System.out.println(st1.getGrade());
		
		System.out.println(st2.getTestAverage());
		System.out.println(st2.getGrade());
		
		System.out.println(st3.getTestAverage());
		System.out.println(st3.getGrade());
		
		//set the grade for all students
		
		st1.computeGrade();
		st2.computeGrade();
		st3.computeGrade();
		
		//display updated information
		System.out.println(st1.getTestAverage());
		System.out.println(st1.getGrade());
		
		System.out.println(st2.getTestAverage());
		System.out.println(st2.getGrade());
		
		System.out.println(st3.getTestAverage());
		System.out.println(st3.getGrade());
		
		//undergrad stuff
		System.out.println("******************\n\n");
		System.out.println(ug1.getTestAverage());
		System.out.println(ug1.getGrade());
		ug1.computeGrade();
		System.out.println(ug1.getTestAverage());
		System.out.println(ug1.getGrade());
		
		//graduate stuff
		System.out.println("******************\n\n");
		System.out.println(g1.getTestAverage());
		System.out.println(g1.getGrade());
		g1.computeGrade();
		System.out.println(g1.getTestAverage());
		System.out.println(g1.getGrade());
		
		//polymorphism and dynamic binding
		System.out.println("*******POLY**********");
		Student s = new Student("Student",tests3, "?");
		Student g = new GradStudent("GRAD",tests3, "?",999);
		Student u = new Undergrad("UNDERG",tests3, "?");
		
		s.computeGrade();
		g.computeGrade();
		u.computeGrade();
		
		System.out.println(s.getGrade());
		System.out.println(g.getGrade());
		System.out.println(u.getGrade());
		
		System.out.println(((GradStudent)g).getID());
	}


}
