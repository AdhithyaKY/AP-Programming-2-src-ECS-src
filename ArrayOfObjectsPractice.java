
public class ArrayOfObjectsPractice {

	public static void main(String[] args) {
		Card [] cards = new Card [10];
		
		for(int x = 0; x < 3;x++){
			cards[x] = new Card();
		}
		for(Card c : cards){
			System.out.println(c);
		}
		for  (int x =0; x < cards.length; x++)
			System.out.println(cards[x]);

	}

}
