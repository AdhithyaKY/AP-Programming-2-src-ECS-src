/*
 * Adhithya Kondalsamy
 * Period: 6
 * 2/24/17
 * ArrayList practice.  
 */
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListPracticeAssignment {

	public static void main(String[] args) {
		ArrayList <String> name = new ArrayList <String>();
		Scanner keyboard = new Scanner(System.in);
		System.out.println(name);
		System.out.println("Enter strings(done to stop): ");
		String x = keyboard.next();
		
		while(!x.equals("done")){
			
			name.add(x);
			System.out.println("Enter strings(done to stop): ");
			x = keyboard.next();
		}
	
		System.out.println(name);
		name.remove(0);
		int size = name.size();
		name.remove(size-2);
		System.out.println(name);
		if(name.size() >= 3){
			name.set(2,"ABC");
			System.out.println(name);
		}

	}

}
