
public class Test {

	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards ();
		Card c, d, e;
		deck.displayDeck();
		System.out.println();
	    c=deck.deal();
		deck.displayDeck();
		System.out.println();
		d= deck.deal();
		e= deck.deal();
		deck.displayDeck();
		
		System.out.println(c + "  " + d + " " + e);
	}

}
