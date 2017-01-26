/*
 * Adhithya Kondalsamy
 * Amberg
 * Period: 3
 * Code that displays five rolls of two dice where each die is numbered from 1 to 6.
 * It also shows the total of each roll.
 */
public class DiceRolls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//processing & output
		System.out.println("Dice 1\tDice 2\tTotal");
		for(int b=0; b<=5; b++){
			int d1=(int) ((6)* Math.random() + 1);
			int d2=(int) ((6)* Math.random() + 1);
			int total = d1 + d2;
			System.out.println(" "+d1+"\t " + d2 + "\t " + total);
		}//end for loop
		
	}//end main

}//end DiceRolls
