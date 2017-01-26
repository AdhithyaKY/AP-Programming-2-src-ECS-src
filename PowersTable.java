
public class PowersTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("x^1\tx^2\tx^3\tx^4\tx^5");
		for(int x=1; x<=6; x++){
			System.out.println((int)x+"\t" + (int)Math.pow(x,2)+"\t" + (int)Math.pow(x,3)+"\t" + (int)Math.pow(x,4)+"\t " + (int)Math.pow(x,5));
		}

	}

}
