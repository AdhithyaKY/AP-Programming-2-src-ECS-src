public class WarGame {
	public static final int NUMBER_CARDS_DECK = 52;
	private static final int NUMBER_CARDS_TIEBREAKER = 3;

	public static void main(String[] args) {
		Card[] entireDeck = createDeck();
		Card[] shuffledDeck = shuffleDeck(entireDeck);
		// An array of size NUMBER_CARDS_DECK is created for each player.
		Card[] playerOne = new Card[NUMBER_CARDS_DECK];
		Card[] playerTwo = new Card[NUMBER_CARDS_DECK];

		// Loop to distribute the cards to the arrays playerOne and playerTwo.
		// Cards with an even index are put into playerOne and cards with an
		// odd index are put into playerTwo.
		for (int i = 0; i < NUMBER_CARDS_DECK; i++) {
			if (i % 2 == 0) {
				playerOne[i / 2] = shuffledDeck[i];
			} else {
				playerTwo[i / 2] = shuffledDeck[i];
			}
		}

		while (hasCards(playerOne) && hasCards(playerTwo)) {

			System.out.println("Player one has " + countCards(playerOne)
					+ " cards and player two has " + countCards(playerTwo)
					+ " cards.");

			// one round of the game.
			playRound(playerOne, playerTwo);

			// spacing to separate the rounds in the game.
			System.out.println("\n");
		}

		if (hasCards(playerOne)) {
			System.out.println("Player one won!");
		} else {
			System.out.println("Player two won!");
		}
	}

	// The createDeck method takes nothing as input and returns a Card[].
	// The Card array will contain 52 Card Objects, each of which
	// has a different value and suit. All 52 combinations of suit/value
	// will be present in one of these Objects in the array.
	private static Card[] createDeck() {
		Card[] entireDeck = new Card[NUMBER_CARDS_DECK];
		int z = 0;
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++) {
				entireDeck[z] = new Card();
				entireDeck[z].setSuit(j);
				entireDeck[z].setNumber(i + 1);
				z++;
			}
		}

		return entireDeck;
	}

	// The shuffleDeck method randomly swaps cards in the array for
	// a preset number of loops.
	private static Card[] shuffleDeck(Card[] deck) {
		final int NUMBER_SWAPS = 100000;
		// creates a random number generator.
		java.util.Random generator = new java.util.Random();

		// 2 random between 0 and 52 are chosen and the cards at those indexes
		// are swapped. This takes place NUMBER_SWAPS times.

		for (int i = 0; i < NUMBER_SWAPS; i++) {
			// Generate 2 random ints between 0 and 52 (counting 0 but not 52).
			int index1 = generator.nextInt(NUMBER_CARDS_DECK);
			int index2 = generator.nextInt(NUMBER_CARDS_DECK);

			Card temporaryCard = deck[index1];

			deck[index1] = deck[index2];

			deck[index2] = temporaryCard;
		}

		return deck;
	}

	// playRound method plays one round of the war game.
	private static void playRound(Card[] deck1, Card[] deck2) {
		// creates an array of Card objects to store the cards in the pile.
		// These cards will be added to each array.
		Card[] pile = new Card[NUMBER_CARDS_DECK];

		Card playerOneCard = deck1[0];
		Card playerTwoCard = deck2[0];

		// removes the first card from playerOneCard and `
		// shifts everything over, so that the value at index 0 is a
		// different card.
		removeTopCard(deck1);
		addCardToBottom(pile, playerOneCard);
		removeTopCard(deck2);
		addCardToBottom(pile, playerTwoCard);

		int comparison = compareCards(playerOneCard, playerTwoCard);
		printRoundResults(playerOneCard, playerTwoCard);

		while (comparison == 0) {
			// deals out 3 more cards, then evaluates again on the 4th.
			// makes sure that the piles are not empty.

			for (int j = 0; j < NUMBER_CARDS_TIEBREAKER; j++) {
				// assures that both decks have cards before removing from the
				// top. In this case, if a deck has nothing in it, it will
				// return. This means it will leave the method
				// and in the main method, the central while loop will be left.
				if (!hasCards(deck1) || !hasCards(deck2)) {
					return;
				}

				addCardToBottom(pile, deck1[0]);
				addCardToBottom(pile, deck2[0]);
				removeTopCard(deck1);
				removeTopCard(deck2);
			}

			if (!hasCards(deck1) || !hasCards(deck2)) {
				return;
			}

			// compares two top cards again
			playerOneCard = deck1[0];
			playerTwoCard = deck2[0];

			// removes the first card from playerOneCard
			removeTopCard(deck1);
			addCardToBottom(pile, playerOneCard);
			removeTopCard(deck2);
			addCardToBottom(pile, playerTwoCard);

			comparison = compareCards(playerOneCard, playerTwoCard);
			printRoundResults(playerOneCard, playerTwoCard);
		}

		// adds all cards in the pile to the winner of the round's hand.
		if (comparison > 0) {
			while (hasCards(pile)) {
				addCardToBottom(deck1, pile[0]);
				removeTopCard(pile);
			}
		} else if (comparison < 0) {
			while (hasCards(pile)) {
				addCardToBottom(deck2, pile[0]);
				removeTopCard(pile);
			}
		}
	}

	// This method prints the output of a round given two Cards
	private static void printRoundResults(Card playerOneCard, Card playerTwoCard) {
		System.out.println("Player one plays " + playerOneCard.getNumber());
		System.out.println("Player two plays " + playerTwoCard.getNumber());

		int comparison = compareCards(playerOneCard, playerTwoCard);

		if (comparison == 0) {
			System.out.println("WAR!");
		} else if (comparison > 0) {
			System.out.println("Player one wins the round.");
		} else {
			System.out.println("Player two wins the round.");
		}
	}

	// This method removes a card from an array by taking the top card off and
	// shifting every other value in the array over.
	private static void removeTopCard(Card[] deck) {

		for (int i = 0; i < deck.length - 1; i++) {
			deck[i] = deck[i + 1];
		}
	}

	// This method takes as input, a Card array and a Card.
	// It adds the Card to the first non-null spot of the card array.
	private static void addCardToBottom(Card[] deck, Card newCard) {
		for (int i = 0; i < deck.length; i++) {
			if (deck[i] == null) {
				deck[i] = newCard;
				return;
			}
		}
	}

	// This method takes as input, 2 Cards. It assumes neither Card is null
	// If the value of card1 == the value of card2, it returns 0;
	// If the value of card1 > the value of card2, it returns 1;
	// If the value of card1 < the value of card2, it returns -1;
	// Aces are > king.
	private static int compareCards(Card card1, Card card2) {
		int playerOneNumber = card1.getNumber();
		int playerTwoNumber = card2.getNumber();

		if (playerOneNumber == playerTwoNumber) {
			return 0;
		}

		// Check for aces.
		if (playerOneNumber == 1) {
			return 1;
		}

		if (playerTwoNumber == 1) {
			return 1;
		}

		if (playerTwoNumber > playerOneNumber) {
			return -1;
		} else {
			return 1;
		}
	}

	private static boolean hasCards(Card[] deck) {
		for (int i = 0; i < deck.length; i++) {
			if (deck[i] != null) {
				return true;
			}
		}

		return false;
	}

	private static int countCards(Card[] deck) {
		int total = 0;
		for (int i = 0; i < deck.length; i++) {
			if (deck[i] != null) {
				total++;
			}
		}

		return total;
	}
}