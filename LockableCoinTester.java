/*
 * Adhithya Kondalsamy
 * Period: 6
 * 1/3/17
 * code that tests all methods and constructors in Coin.
 */
public class LockableCoinTester {

	
	public static void main(String[] args) {
		
		
		Coin c = new Coin();
		Coin c2 = new Coin(1, 22, .25);
		Coin c3 = new Coin (0, 33, .05);
		Coin c4 =new Coin(1, 44, .25);
		
		System.out.println("starting coin state");
		System.out.println(c);
		
		System.out.println("flip the coin");
		c.flip();
		System.out.println(c);
		System.out.println("flip the coin again");
		c.flip();
		System.out.println(c);
		System.out.println();
		System.out.println("check locked");
		System.out.println(c.locked());
		System.out.println();
		System.out.println("change the key");
		c.setKey(5);
		System.out.println();
		System.out.println("check locked");
		System.out.println(c.locked());
		System.out.println();
		System.out.println("lock it and check locked");
		c.lock(5);
		System.out.println(c.locked());
		System.out.println();
		System.out.println("try to flip locked coin");
		c.flip();
		System.out.println(c);
		c.flip();
		System.out.println(c);
		System.out.println();
		System.out.println("try to unlock with wrong key");
		c.unlock(7);
		System.out.println();
		System.out.println("check locked");
		System.out.println(c.locked());
		c.flip();
		System.out.println(c);
		System.out.println("try to unlock with right key");
		c.unlock(5);
		System.out.println();
		System.out.println("check locked");
		System.out.println(c.locked());
		c.flip();
		System.out.println(c);
		c.flip();
		System.out.println(c);
		
		System.out.println("\nTesting compareTo...");
		System.out.println("Compare c2 to c3 " + c2.compareTo(c3));
		System.out.println("Compare c3 to c4 " + c3.compareTo(c4));
		System.out.println("Compare c2 to c4 " + c2.compareTo(c4));

	}

}
