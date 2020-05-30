package day22_stringManipulation_Lab;

public class Question_8 {

	public static void main(String[] args) {

		System.out.println(left2("Hello"));
		System.out.println(left2("Java"));
		System.out.println(left2("Hi"));
	}

	private static String left2(String str) {

		if(str.length()<2) {
			return "Invalid String";}
		
		return str.substring(2).concat(str.substring(0,2));
		
		
	}

}
