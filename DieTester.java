
public class DieTester {

	public static void main(String[] args) {
		//variables
		Die d1 = new Die();
		Die d2 = new Die(20);
		Die d3 = new Die(3);
		Coin c = new Coin();
		int currentVal;
		currentVal = d1.getFaceValue();
		System.out.println("d1 facevalue = " + currentVal);
		System.out.println("d1 facevalue = " + d2.getFaceValue());
		System.out.println("d1 facevalue = " + d3.getFaceValue());
		System.out.println("d1.equals(d2)" + d1.equals(d2));
		d1.roll();
		d2.roll();
		d3.roll();
		System.out.println("d1 facevalue = " + d1.getFaceValue());
		System.out.println("d1 facevalue = " + d2.getFaceValue());
		System.out.println("d1 facevalue = " + d3.getFaceValue());
		System.out.println("d1.equals(d2)" + d1.equals(d2));
		System.out.println(d1.equals("String"));
	}

}
