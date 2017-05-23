
public class RecursionPractice {

	public static void main(String[] args) {
		System.out.println(recur1("shadow"));
		System.out.println(recur2("shadow"));

	}
	public static String recur1(String str){
		if(str.length() == 0){
			return str;
		}
		return recur1(str.substring(1)) + str.substring(0, 1)+ "#";
	}
	public static String recur2(String str){
		if(str.length() == 0){
			return str;
		}
		return str.substring(0,1)+ "#" + recur2(str.substring(1));
	}

}
