package day23_stringManipulation_Lab2;

public class Question_12 {

	public static void main(String[] args) {

		String str = "catCatdogDog";
		int counterCat = 0;
		int counterDog = 0;

		for (int i = 0; i < str.length() - 2; i++) {

			if (str.substring(i, i + 3).equalsIgnoreCase("cat")) {
				counterCat++;
			}
			if (str.substring(i, i + 3).equalsIgnoreCase("dog")) {
				counterDog++;
			}
		}
		if (counterCat == counterDog) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
