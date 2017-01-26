
public class Employee implements Comparable <Employee> {
	//static variable to keep track of the next id
	private static int nextID = 1;
	//instance variables
	private String firstName, lastName;
	private int id;
	private double hourlyRate;
	
	//constructor
	public Employee(String firstName, String lastName, double hourlyRate){
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
		id = nextID;
		nextID ++;
		
	}
	public Employee(String firstName, String lastName, double hourlyRate,int id){
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
		this.id = id;
		
		
	}
	
	public double getHourlyRate(){
		return hourlyRate;
	}
	public String toString(){
		return lastName + ", " + firstName + "\nid: " + id + " \nhourly rate: " + hourlyRate;
	}
	public static int nextId(){
		
		return nextID;
		
	}
	public int compareTo(Employee emp) {
		
		if(this.lastName.compareTo(emp.lastName) == 0){
			
			if(this.firstName.compareTo(emp.firstName)==0){
				
				return this.id - emp.id;
			}
			else return this.firstName.compareTo(emp.firstName);
		}
		return this.lastName.compareTo(emp.lastName);
		
	}
}
