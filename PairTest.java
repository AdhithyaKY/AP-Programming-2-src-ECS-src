/*
 * program purpose - test all methods and constructors in PairOfDice
 */
public class PairTest {

	public static void main(String[] args) {		
		
		//testing all constructors
		PairOfDice pair1 = new PairOfDice();		
		PairOfDice pair2 = new PairOfDice(10);
		PairOfDice pair3 = new PairOfDice(6,12);
		PairOfDice pair4 = new PairOfDice(3); //testing with invalid # sides
		
		//testing toString overloaded
		System.out.println("Pair 1: " + pair1);
		System.out.println("Pair 2: " + pair2);
		System.out.println("Pair 3: " + pair3);
		System.out.println("Pair 4: " + pair4);
		System.out.println();
		System.out.println();
		
		//testing roll for all
		System.out.println("Rolling all...");
		pair1.roll();
		pair2.roll();
		pair3.roll();
		pair4.roll();
		
		//testing getFaceValue1, getFaceValue2 and getTotalFaceValue
		System.out.println("Pair 1 After rolling...");
		System.out.println("Pair 1: " + pair1);
		System.out.println("Pair 1 FV 1: " +pair1.getFaceValue1());
		System.out.println("Pair 1 FV 2: " +pair1.getFaceValue2());
		System.out.println("Pair 1 Total Value: " + pair1.getTotalValue() );
		System.out.println();
		System.out.println("Pair 2 After rolling...");
		System.out.println("Pair 2: " + pair2);
		System.out.println("Pair 2 FV 1: " +pair2.getFaceValue1());
		System.out.println("Pair 2 FV 2: " +pair2.getFaceValue2());
		System.out.println("Pair 2 Total Value: " + pair2.getTotalValue() );
		System.out.println();
		System.out.println("Pair 3 After rolling...");
		System.out.println("Pair 3: " + pair3);
		System.out.println("Pair 3 FV 1: " +pair3.getFaceValue1());
		System.out.println("Pair 3 FV 2: " +pair3.getFaceValue2());
		System.out.println("Pair 3 Total Value: " + pair3.getTotalValue() );
		System.out.println();
		System.out.println("Pair 4 After rolling...");
		System.out.println("Pair 4: " + pair4);
		System.out.println("Pair 4 FV 1: " +pair4.getFaceValue1());
		System.out.println("Pair 4 FV 2: " +pair4.getFaceValue2());
		System.out.println("Pair 4 Total Value: " + pair4.getTotalValue() );
		System.out.println();
	}//end of main	
	
}//end of PairOfDiceTester
