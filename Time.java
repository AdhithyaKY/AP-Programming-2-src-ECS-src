import java.text.DecimalFormat;


public class Time {
	//instance variables
	private int hours;
	private int minutes;
	private int seconds;
	private String meridiem;
	
	//constructor
	public Time(int h, int m, int s, String mer){
		hours = h;
		minutes = m;
		seconds = s;
		meridiem = mer;
	}
	//mutator methods
	//precondition: h is a valid value for hours.
	//postcondition: sets hours to h.
	public void setHours(int h){
		hours = h;
	}
	//precondition: m is a valid value for minutes.
	//postcondition: sets minutes to m.
	public void setMinutes(int m){
		minutes = m;
	}
	//precondition: s is a valid value for seconds.
	//postcondition: sets seconds to s.
	public void setSeconds(int s){
		seconds = s;
	}
	public String toString(){
		DecimalFormat fmt = new DecimalFormat("00");
		return fmt.format(hours)+ ":" + fmt.format(minutes)+ ":" + fmt.format(seconds) + " " + meridiem;
	}
	
}
