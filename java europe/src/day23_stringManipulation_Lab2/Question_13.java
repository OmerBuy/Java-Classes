package day23_stringManipulation_Lab2;

public class Question_13 {

	public static void main(String[] args) {

		System.out.println(doubleChar("Hi-The"));

	}

	private static String doubleChar(String str) {
		
		String newString = "";
		
		for (int i = 0; i < str.length(); i++) {

			newString = newString + str.substring(i, i + 1).concat(str.substring(i, i + 1));

		}
		return newString;
	}
}
