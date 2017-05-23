
public class DescendingSortsTester {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		DescendingSorts.selectionSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		DescendingSorts.insertionSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
