/*
 * Adhithya Kondalsamy
 * Period: 6
 * Amberg
 * 1/11/17
 * Creates a date object with a month day and year
 * Can be compared and set and the year can be
 * incremented. The day, month, and year can be
 * returned.
 */
public class Date implements Comparable<Date> {

	// data members
	private String month;
	private int day;
	private int year;

	// constructors

	// constructor with no parameters
	public Date() {
		month = "January";
		day = 1;
		year = 2000;
	}// end of Date empty constructor

	public Date(String m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}// end of user entered Date

	// accessors

	// precondition: none
	// postcondition: returns value stored in month
	public String getMonth() {
		return month;
	}// end of getMonth()

	// precondition: none
	// postcondition: returns value stored in year
	public int getYear() {
		return year;
	}// end of getYear

	// precondition: none
	// postcondition: returns value stored in day
	public int getDay() {
		return day;
	}// end of getDay

	// precondition: none
	// postcondition: returns a string representing the
	// date in mm,dd,yyyy

	public String toString() {
		return month + " " + day + ", " + year;
	}// end of toString

	// mutators
	// precondition: none
	// postcondition: increments year by 1

	public void incrementYear() {
		year++;
	}// end of incrementYear

	// precondition: none
	// postcondition: increments day by 1.

	public void incrementDay() {
		if (day < 28) {
			day++;
		} else if (month == "February") {
			month = "March";
			day = 1;
		} else if (month == "January") {
			if (day < 30) {
				day++;
			} else {
				month = "February";
				day = 1;
			}
		} else if (month == "March") {
			if (day < 30) {
				day++;
			} else {
				month = "April";
				day = 1;
			}
		} else if (month == "May") {
			if (day < 30) {
				day++;
			} else {
				month = "June";
				day = 1;
			}
		} else if (month == "July") {
			if (day < 30) {
				day++;
			} else {
				month = "August";
				day = 1;
			}
		} else if (month == "August") {
			if (day < 30) {
				day++;
			} else {
				month = "September";
				day = 1;
			}
		} else if (month == "September") {
			if (day < 30) {
				day++;
			} else {
				month = "October";
				day = 1;
			}
		} else if (month == "October") {
			if (day < 30) {
				day++;
			} else {
				month = "November";
				day = 1;
			}
		} else if (month == "December") {
			if (day < 31) {
				day++;
			} else {
				month = "January";
				day = 1;
				year++;
			}
		} else if (month == "April") {
			if (day < 29) {
				day++;
			} else {
				month = "May";
				day = 1;
			}
		} else if (month == "June") {
			if (day < 29) {
				day++;
			} else {
				month = "July";
				day = 1;
			}
		} else if (month == "September") {
			if (day < 29) {
				day++;
			} else {
				month = "October";
				day = 1;
			}
		} else if (month == "November") {
			if (day < 29) {
				day++;
			} else {
				month = "December";
				day = 1;
			}
		}

	}

	public void incrementMonth() {
		if (month == "December") {
			month = "January";
			year++;
		} else if (month == "January") {
			month = "February";
		} else if (month == "February") {
			month = "March";
		} else if (month == "March") {
			month = "April";
		} else if (month == "April") {
			month = "May";
		} else if (month == "May") {
			month = "June";
		} else if (month == "June") {
			month = "July";
		} else if (month == "July") {
			month = "August";
		} else if (month == "August") {
			month = "September";
		} else if (month == "September") {
			month = "October";
		} else if (month == "October") {
			month = "November";
		} else {
			month = "December";
		}
	}

	// precondition: none
	// postcondition: sets the year to yearNumber
	public void setYear(int yearNumber) {
		year = yearNumber;
	}// end of setYear

	// precondition: dayNumber is a valid number for the month
	// postcondition: sets day to dayNumber
	public void setDay(int dayNumber) {
		boolean dateValid = true;
		if (month == "february" && dayNumber > 29) {
			dateValid = false;
		}
		if (dayNumber < 1 || dayNumber > 31) {
			dateValid = false;
		} else if ((month == "January") || (month == "March")
				|| (month == "May") || (month == "July") || (month == "August")
				|| (month == "October") || (month == "December")) {
			if (dayNumber <= 31)
				dateValid = true;
		} else {
			dateValid = true;
		}
	}// end ofSetDay

	// precondition: monthString is a valid name of a month
	// postcondition: sets month to monthString
	public void setMonth(String monthString) {
		if (monthString == "January" || monthString == "February"
				|| monthString == "March" || monthString == "April"
				|| monthString == "May" || monthString == "June"
				|| monthString == "July" || monthString == "August"
				|| monthString == "September" || monthString == "October"
				|| monthString == "November" || monthString == "December") {
			month = monthString;
		} else {
			System.out.println("Invalid month name.");
		}

	}// end of setMonth

	// precondition: the date is valid
	// postcondition: returns a value when comparing the date
	// uses year, if same uses month, if same uses day
	public int compareTo(Date today) {

		if (this.year == today.year) {
			if (this.getMonthNumber() == today.getMonthNumber()) {
				if (this.day == today.day)
					return 0;
				else
					return this.day - today.day;

			} else
				return (this.getMonthNumber())- (today.getMonthNumber());
		} else
			return (this.year)- (today.year);

	}

	// precondition: month is a valid name of a month
	// postcondition: returns a number for the corresponding month.
	// helper for the compareTo method
	private int getMonthNumber() {
		String m = getMonth();

		if (m.equalsIgnoreCase("January"))
			return 1;
		else if (m.equalsIgnoreCase("February"))
			return 2;
		else if (m.equalsIgnoreCase("March"))
			return 3;
		else if (m.equalsIgnoreCase("April"))
			return 4;
		else if (m.equalsIgnoreCase("May"))
			return 5;
		else if (m.equalsIgnoreCase("June"))
			return 6;
		else if (m.equalsIgnoreCase("July"))
			return 7;
		else if (m.equalsIgnoreCase("August"))
			return 8;
		else if (m.equalsIgnoreCase("September"))
			return 9;
		else if (m.equalsIgnoreCase("October"))
			return 10;
		else if (m.equalsIgnoreCase("November"))
			return 11;
		else if (m.equalsIgnoreCase("December"))
			return 12;
		else
			return 0;

	}// end of getMonthNumber

}// end of Date class
