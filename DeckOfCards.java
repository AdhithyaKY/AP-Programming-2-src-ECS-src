/*
 * Adhithya Kondalsamy
 * Period: 6
 * Amberg
 * 2/28/17
 * Code that creates and modifies a deck of cards.
 */
import java.util.ArrayList;

public class DeckOfCards {
	// instance variables use an ArrayList to create a deck of 52 cards
	private ArrayList<Card> deck;

	// constructor
	// instantiates a deck of 52 playing cards: Ace through King in each suit
	public DeckOfCards() {
		deck = new ArrayList<Card>();
		for (int a = 1; a <5; a++) {
			for (int b = 1; b < 14; b++) {
				deck.add(new Card(b,a));
			}
		}
	}

	// modifiers

	// simulates shuffling the deck of cards by randomizing the order of the
	// deck

	public void shuffle() {
		for (int x = 0; x < 50; x++) {
			int num1 = (int) (Math.random() * (deck.size()-1));
			int num2 = (int) (Math.random() * (deck.size()-1));
			swap(num1, num2);
		}
	}

	// private method used to help with shuffling deck - swaps two cards in the
	// deck
	private void swap(int i1, int i2) {
		Card temp = deck.get(i1);
		deck.set(i1, deck.get(i2));
		deck.set(i2, temp);

	}

	// removes and returns the card at the top of the deck
	public Card deal() {
		Card c = deck.remove(0);
		return c;
	}

	// accessors
	// returns the number of cards remaining in the deck
	public int cardsRemaining() {
		return deck.size();
	}

	// displays one card on each line
	public void displayDeck() {
		for (int i = 0; i < deck.size(); i++) {
			System.out.println(deck.get(i));
		}
	}
}
