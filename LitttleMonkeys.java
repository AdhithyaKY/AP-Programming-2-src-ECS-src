public class LitttleMonkeys {

	public static void main(String[] args) {
		littleMonkeys(5);
	}

	public static void littleMonkeys(int n) {
		if (n == 0) {
			return;
		}
		System.out.println();
		if (n == 1) {
			System.out.println(n + " little monkey jumping on the bed.");
		} else
			System.out.println(n + " little monkeys jumping on the bed.");
		System.out.println("One fall off and bumped his head.");
		System.out.println("Mama called the doctor and the doctor said,");
		System.out.println("NO MORE MONKEYS JUMPING ON THE BED!");
		System.out.println();
		littleMonkeys(n - 1);
	}

}
