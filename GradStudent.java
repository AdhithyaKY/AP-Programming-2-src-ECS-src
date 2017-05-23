
public class GradStudent extends Student{
	private int myGradID;
	
	//constructor
	public GradStudent(){
		super();
		myGradID = 0;
	}
	public GradStudent(String name, int[] tests, String grade, int id){
		super(name, tests, grade);
		myGradID = id;
	}
	public int getID(){
		return myGradID;
	}
	public void computeGrade(){
		if(this.getTestAverage()>=90){
			setGrade("Passing with distinction");
		}else{
			super.computeGrade();
		}
	}
}
