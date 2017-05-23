import java.util.ArrayList;
public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList <Double> scores = new ArrayList <Double>();
		System.out.println(scores.size());
		scores.add(100.0);
		scores.add(75.6);
		scores.add(98.9);
		System.out.println(scores);
		System.out.println(scores.get(0));
		System.out.println(scores);
		scores.remove(1);
		System.out.println(scores);
		scores.add(1,50.5);
		System.out.println(scores);
		scores.add(3,99.7);
	}

}
