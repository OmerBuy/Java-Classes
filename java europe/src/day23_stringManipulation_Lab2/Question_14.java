package day23_stringManipulation_Lab2;

public class Question_14 {

	public static void main(String[] args) {

		String str = "cadcly";

		if (str.length() < 2) {
			System.out.println(false);
			return;
		}

		if (str.substring(str.length() - 2).equals("ly")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
