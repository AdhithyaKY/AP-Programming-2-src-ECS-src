
public class Undergrad extends Student {
	//constructors
	public Undergrad(){
		super();
	}
	public Undergrad(String name, int[] t, String grade){                      
		super(name,t,grade);
	}
	//overrides computeGrade inherited from Student 
	public void computeGrade(){
		if(getTestAverage() >=70){
			setGrade("Pass");
		}else{
			setGrade("Fail");
		}
	}
}
