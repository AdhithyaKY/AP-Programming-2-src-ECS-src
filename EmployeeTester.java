
public class EmployeeTester {

	public static void main(String[] args) {
		Employee e1 = new Employee ("John", "Smith", 15.50);
		Employee e2 = new Employee ("Susan", "Joans", 16.50);
		Employee e3 = new Employee ("John", "Smith", 15.75);
		final String line = "********************************";
		
		System.out.println(e1);
		System.out.println(line);
		System.out.println(e2);
		System.out.println(line);
		System.out.println(e3);
		System.out.println(line);
		System.out.println(e1.getHourlyRate());
		System.out.println(line);
		System.out.println(Employee.nextId());
		System.out.println(line);
		
		
		System.out.println("Compare e1 to e1 " + e1.compareTo(e2));
		System.out.println("Compare e1 to e3 " + e1.compareTo(e3));
		
	}

}
