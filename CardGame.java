
class CardGame {

	public static void main(String[] args) {
		Card c1 = new Card(4,3);
		Card c2 = new Card(4, 2);
	
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.getFace());
		System.out.println(c1.isHigherThan(c2));
		System.out.println(c1.isHigherThan(c2,true));
		System.out.println(c1.isHigherThan(c2,false));
		System.out.println(c2.isHigherThan(c1,true));
		System.out.println(c2.isHigherThan(c1,false));

	}

}
