
public class TimeClient {

	public static void main(String[] args) {
		Time t = new Time(7,8,9,"AM");
		int hour = 10;
		Time t2 = null;
		
		System.out.println("The time is " + t);
		System.out.println("The value in hours " + hour);
		System.out.println("t2 is " + t2);
		System.out.println("calling changeTime...");
		changeTime(t, hour);
		System.out.println("back in main...");
		System.out.println("Time time is " + t);
		System.out.println("The value in hour " + hour);
		System.out.println("calling change time with t2...");
		//changeTime(t2,hour);
		t2 = t;//t2 is now an alias for t
		changeTime(t2,3);
		System.out.println(t);
		System.out.println(t2);
		
	}//end main
	public static void changeTime(Time time, int hour){
		hour ++;
		time.setHours(hour);
		System.out.println("in the changeTime method...");
		System.out.println("The time is " + time);
		System.out.println("hour is " + hour);
	}
}
