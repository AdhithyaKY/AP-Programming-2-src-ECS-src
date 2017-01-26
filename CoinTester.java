
public class CoinTester {

	public static void main(String[] args) {
		//variables 
		Coin c1 = new Coin();//make me coin 1 c1
		Coin c2 = new Coin();
		Coin c3 = new Coin(0);
		Coin c4 = new Coin(1);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		c1.flip();
		c2.flip();
		System.out.println("c1 is " + c1);
		System.out.println("c2 is " + c2);
		System.out.println("Is c2 heads? " + c2.isHeads());
	}

}
