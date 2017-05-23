
public class TwoDPractice {

	public static void main(String[] args) {
	int [][] arr = new int [3][6];
	for(int row = 0; row<arr.length;row++){
		for(int column =0; column<arr[row].length; column++){
			arr[row][column]=(int)((Math.random()*10)+1);
		}
	}
	for(int row = 0; row<arr.length;row++){
		for(int column =0; column<arr[row].length; column++){
			System.out.print(arr[row][column]+ "\t");
		}
		System.out.println();
	}

}
}