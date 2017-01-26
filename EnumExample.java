public class EnumExample {

	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}

	public static void main(String[] args) {
		Day day = Day.SUNDAY;
		int[] list = new int[9];
		
		ArrayPractice1.updateArray(list);
		ArrayPractice1.displayArray(list);
		System.out.println(day);
		System.out.println(Day.THURSDAY);
		if (day == Day.SUNDAY)
			System.out.println("Football");
	}
	
}
   