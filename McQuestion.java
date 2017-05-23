import java.util.ArrayList;


public class McQuestion {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Why");
		list.add("isn't");
		list.add("it");
		list.add("Friday");
		System.out.println(list.get(3));
		list.add(new Card());
		list.add(13);
		int len = ((String)list.get(5)).length();

	}

}
