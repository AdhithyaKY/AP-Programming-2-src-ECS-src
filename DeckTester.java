public class DeckTester
{
	public static void main (String []args)
	{
		DeckOfCards deck1 = new DeckOfCards();
		
		System.out.println("\n\nCreating a deck...");
		deck1.displayDeck();
		
		deck1.shuffle();
		System.out.println("\n\n\nSHUFFLED");
		deck1.displayDeck();
		
		//Cards remaining
		
		System.out.println("number of cards remaining = " + deck1.cardsRemaining());
		//Deal some cards
		System.out.println("\n\n\nDEAL SOME");
		System.out.println( deck1.deal());
		System.out.println( deck1.deal());
		System.out.println( deck1.deal());
		System.out.println( deck1.deal());
		System.out.println( deck1.deal());
		System.out.println( deck1.deal());
		System.out.println( deck1.deal());
		System.out.println( deck1.deal());
		System.out.println( deck1.deal());
		System.out.println( deck1.deal());
		System.out.println( deck1.deal());
		System.out.println( deck1.deal());
		
		System.out.println("\n\n\nRemaining");
		System.out.println("number of cards remaining = " + deck1.cardsRemaining());
		System.out.println("\nDisplaying deck again...");
		deck1.displayDeck();
		System.out.println("\nshuffle partial deck...\n");
		deck1.shuffle();
		deck1.displayDeck();
	}
}