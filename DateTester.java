/*
 * Adhithya Kondalsamy
 * Period: 6
 * 1/11/17
 * Amberg
 * Code that acts as a tester Date.java
 */
public class DateTester {

	public static void main(String[] args) {
		
		// instantiate Date objects and test both constructors
		
		
		Date d1 = new Date();
		Date d2 = new Date();
		Date d3 = new Date("January", 7, 2017);
		Date d4 = new Date ("October", 20, 2018);
		Date d5 = new Date ("October", 20, 2020);
		Date d6 = new Date("January", 17, 2017);
		Date d7 = new Date ("November", 20, 2020);
		Date d8 = new Date("December", 30, 2017);
		Date d9 = new Date("September", 29, 2017);
		Date d10 = new Date("February", 27, 2017);
		
		//testing toString and viewing constructed objects
		System.out.println("\n******************************************\n");
		System.out.println("Show the dates created & check toString...\n");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		System.out.println(d10);	
		System.out.println("\n******************************************\n");
		
		//testing accessors - getMonth, getDay and getYear
		System.out.println("\n******************************************\n");
		System.out.println("Testing ACCESSOR METHODS with d8"
				+ "\ngetMonth, getDay and getYear with December 30, 2017...\n");
		System.out.println("month is " + d8.getMonth());
		System.out.println("day is " + d8.getDay());
		System.out.println("year is " + d8.getYear());		
		System.out.println("\n******************************************\n");
		
		//testing Comparable - compareTo with a variety of objects
		System.out.println("\n******************************************\n");
		System.out.println("Testing compareTo...\n");
		System.out.println(d1 + " compareTo " + d2 + " = " + d1.compareTo(d2));
		System.out.println(d1 + " compareTo " + d3 + " = " + d1.compareTo(d3));
		System.out.println(d3 + " compareTo " + d4 + " = " + d3.compareTo(d4));
		System.out.println(d4 + " compareTo " + d5 + " = " + d4.compareTo(d5));
		System.out.println(d5 + " compareTo " + d4 + " = " + d5.compareTo(d4));	
		System.out.println(d7 + " compareTo " + d6 + " = " + d7.compareTo(d6));
		System.out.println(d6 + " compareTo " + d3 + " = " + d6.compareTo(d3));
		System.out.println(d7 + " compareTo " + d6 + " = " + d7.compareTo(d6));
		System.out.println(d7 + " compareTo " + d5 + " = " + d7.compareTo(d5));
		System.out.println("\n******************************************\n");
		
		//testing incrementYear
		System.out.println("\n******************************************\n");
		System.out.println("TESTING increment year...\n");
		System.out.println("before increment year " + d1);
		d1.incrementYear();
		System.out.println("after increment year " + d1);
		System.out.println("\n******************************************\n");
		
		//testing incrementMonth - for an entire year
		System.out.println("\n******************************************\n");
		System.out.println("TESTING increment month...\n");
		System.out.println("before increment month " + d1);
		d1.incrementMonth();
		System.out.println("after increment month " + d1);
		System.out.println();
		
		System.out.println("before increment month " + d1);
		d1.incrementMonth();
		System.out.println("after increment month " + d1);
		System.out.println();
		
		System.out.println("before increment month " + d1);
		d1.incrementMonth();
		System.out.println("after increment month " + d1);
		System.out.println();
		
		System.out.println("before increment month " + d1);
		d1.incrementMonth();
		System.out.println("after increment month " + d1);
		System.out.println();
		
		System.out.println("before increment month " + d1);
		d1.incrementMonth();
		System.out.println("after increment month " + d1);
		System.out.println();
		
		System.out.println("before increment month " + d1);
		d1.incrementMonth();
		System.out.println("after increment month " + d1);
		System.out.println();
		
		System.out.println("before increment month " + d1);
		d1.incrementMonth();
		System.out.println("after increment month " + d1);
		System.out.println();
		
		System.out.println("before increment month " + d1);
		d1.incrementMonth();
		System.out.println("after increment month " + d1);
		System.out.println();
		
		System.out.println("before increment month " + d1);
		d1.incrementMonth();
		System.out.println("after increment month " + d1);
		System.out.println();
		
		System.out.println("before increment month " + d1);
		d1.incrementMonth();
		System.out.println("after increment month " + d1);
		System.out.println();
		
		System.out.println("before increment month " + d1);
		d1.incrementMonth();
		System.out.println("after increment month " + d1);	
		System.out.println();
		
		System.out.println("before increment month " + d1);
		d1.incrementMonth();
		System.out.println("after increment month " + d1);
		System.out.println("\n******************************************\n");
		
		System.out.println("\n******************************************\n");
		System.out.println("TESTING increment day...\n");
		System.out.println("before increment day " + d9);
		d9.incrementDay();
		System.out.println("after increment day " + d9);
		System.out.println("before increment day " + d9);
		d9.incrementDay();
		System.out.println("after increment day " + d9);
		System.out.println();
		
		System.out.println();
		System.out.println("before increment day " + d10);
		d10.incrementDay();
		System.out.println("after increment day " + d10);
		System.out.println("before increment day " + d10);
		d10.incrementDay();
		System.out.println("after increment day " + d10);
		System.out.println();
		System.out.println();
		System.out.println("before increment day " + d8);
		d8.incrementDay();
		System.out.println("after increment day " + d8);
		System.out.println("before increment day " + d8);
		d8.incrementDay();
		System.out.println("after increment day " + d8);
		
		System.out.println("\n******************************************\n");
	}

}
