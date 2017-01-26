import java.util.Scanner;

public class ArrayPractice1 {

	public static void main(String[] args) {
		int [] intList1 = new int [5];
		int [] intList2 = {2,4,6,8,10,12,14,16};
		char[] chars = {'x', 'p', 'u', 'c', 'h', 'z'};
		Scanner scan = new Scanner(System.in);
		
		displayArray(intList1);
		displayArray(intList2);
		updateArray(intList1);
		displayArray(intList1);
		doubleArray(intList1);
		displayArray(intList1);
		reverseArray(intList1);
		averageArray(intList1);
		displayArray(chars);
		increaseBy2(chars);
		displayArray(chars);
	}//end main
	
	public static void increaseBy2(char[] c){
		for(int i =0; i < c.length; i++){
			c[i] = (char) (c[i]+2);
		}
	}
	public static void displayArray(char[] arr){
		
		for(char c: arr){
			System.out.print(c + "\t");
		}
		/*for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}*/
		System.out.println();
	}
	public static void displayArray(Object [] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	public static void displayArray(int [] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	public static void updateArray(int [] arr){
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter value " + (i+1) + ": " );
			arr[i] = scan.nextInt();
		}
	}
	public static void doubleArray(int [] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = arr[i] * 2;
		}
	}
	public static void reverseArray(int [] arr){
		for(int i = arr.length -1; i >=0; i--){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	public static void averageArray(int [] arr){
		int x =0;
		for(int i = 0; i<arr.length; i++){
			x += arr[i];
		}
		System.out.print(x /arr.length);
		System.out.println();
	}

}//end ArrayPractice1
