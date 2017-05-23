import java.util.ArrayList;

/********************************************************************
Review - the ArrayList class
Written by: Adhithya Kondalsamy
Period: 6
 
ASSIGNMENT:  Use java’s ArrayList class to write a program that does
 the following:

-	Prints your name and period.
-	Creates an ArrayList of Strings.
-	Has a method called fillArrayList that uses the 2 add methods
		in the ArrayList classs to do the following:
	-	Adds “hamster" to the ArrayList
	-	Adds "cat" to the beginning of the ArrayList
	-	Adds "bird" to the beginning of the ArrayList
	-	Adds "dog" to the list in alphabetical order 
	-	Adds "iguana" to end of the list
	-	Adds "fish" to the list in alphabetical order 
	-	Adds "ferret" to the list in alphabetical order 
	-	Adds “turtle” to the end of the list	
			
-	After the call to fillArrayList prints the list using the toString
 		method. This should be in main. You need a SOP.
-	Has a method called printAllElements that uses a for loop to 
		print the ArrayList, one string per line. Find the methods
		in the ArrayList class that will help you do this.
-	Has a method called printElements that does the following.  
	-	Prints the first element of the list
	-	Prints the last element of the list	
	-	Prints the third element of the list
	-	Prints the index of “fish”						
-	Has a method called removeElements that does the following:
	-	Removes the first element of the list
	-	Removes the last element of the list
	-	Removes the fifth element from the list (after bird is removed)
- Then in the main method:		
	-	Changes “dog” to “puppy”
	-	Uses the toString method to print the new list
	-	Clears the list
	-	Uses the toString method to print the new list					

HAND IN:  
-	Type your names & period at the top of this header.
-	Copy your output to the bottom of your program (in comments).
-	Print and put your print out in the hand in box.
********************************************************************/
public class ArrayListReview {
	public static void main(String args[]){
		System.out.println("Adhithya Kondalsamy");
		System.out.println("Period: 6");
		ArrayList<String> animals = new ArrayList<String>();
		fillArrayList(animals);
		System.out.println(animals);
		printAllElements(animals);
		printElements(animals);
		removeElements(animals);
		int indexOfDog =0;
		for(int i = 0; i <animals.size();i++){
			if(animals.get(i).equals("dog")){
				indexOfDog = i;
			}
		}
		animals.set(indexOfDog,"puppy");
		System.out.println(animals);
		
		int size = animals.size();
		for(int x =0;x<size;x++){
			animals.remove(0);
		}
		System.out.println(animals);
		
	}
	public static void fillArrayList(ArrayList<String> list){
		list.add("hamster");
		list.add(0,"cat");
		list.add(0,"bird");
		list.add(2,"dog");
		list.add("iguana");
		list.add(3,"ferret");
		list.add(4,"fish");
		list.add("turtle");
	}
	public static void printAllElements(ArrayList<String> list){
		for(int i =0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	public static void printElements(ArrayList<String> list){
		System.out.println(list.get(0));
		System.out.println(list.get((list.size())-1));
		System.out.println(list.get(2));
		for(int i = 0; i <list.size();i++){
			if(list.get(i).equals("fish")){
				System.out.println(i);
			}
		}
	}
	public static void removeElements(ArrayList<String> list){
		list.remove(0);
		list.remove(list.size()-1);
		list.remove(4);
	}
}

/*
Adhithya Kondalsamy
Period: 6
[bird, cat, dog, ferret, fish, hamster, iguana, turtle]
bird
cat
dog
ferret
fish
hamster
iguana
turtle
bird
turtle
dog
4
[cat, puppy, ferret, fish, iguana]
[]
 */
