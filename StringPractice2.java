import java.util.Scanner;


public class StringPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String string1, string2;
		
		System.out.println("enter the first word: ");
		string1 = keyboard.next();
		System.out.println("enter the second word: ");
		string2 = keyboard.next();
		System.out.println(string1.compareTo(string2));
		
		if(string1.compareTo(string2) < 0){
			System.out.println(string1);
			System.out.println(string2);
		}
		else if(string1.compareTo(string2) < 0){
			System.out.println(string2);
			System.out.println(string1);
		}
		else{
			System.out.println("same word");
		}
	}

}
