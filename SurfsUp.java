import java.util.Scanner;


public class SurfsUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int waveHeight;
		Scanner input= new Scanner(System.in);
		//input
		System.out.println("type in the wave height: ");
		waveHeight = input.nextInt();
		
		if(waveHeight >= 6)
			System.out.println("it's a great day for surfing");
		else if(waveHeight > 3)
			System.out.println("go body boarding");
		else if(waveHeight >= 0)
			System.out.println("go for a swim");
		else
			System.out.println("what kind of surf is that?");
	}//end main	

}//end SurfsUp
