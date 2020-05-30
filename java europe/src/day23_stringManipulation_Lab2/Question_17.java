package day23_stringManipulation_Lab2;

public class Question_17 {

	public static void main(String[] args) {

		String str = "level";

		String dummy = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			dummy = dummy + str.charAt(i);
		}

		if (dummy.equals(str)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
