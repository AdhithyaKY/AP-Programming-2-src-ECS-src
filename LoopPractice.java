import java.util.Scanner;

/*
 * Practice writing while loops and for loops
 * 
 */
public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		int number, counter = 1;
		Scanner kb = new Scanner(System.in);
		//prompt and read a number
		//then print out the numbers from to number
		System.out.print("Please enter an integer value: ");
		number = kb.nextInt();
		
		while (counter < number){//pretest loop because this test occurs before going into the loop
			
			counter += 1;//increments counter by 1
			System.out.println(counter);//prints the current number
		}//end printing number loop
		
		//display numbers counting by 5 from 5 to 100
		counter = 5;
		while (counter <= 100){
			System.out.println(counter);
			counter += 5;
		}
		//do while loops are post-test, meaning that the test occurs after the loop
		//has executed at least one time.
		counter = 18;
		do{
			System.out.println("counter is " + counter);
			counter++;//makes counter go up by 1
		}while (counter < 20);
	}

}
