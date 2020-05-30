package day13_methods_part1;

public class task65_calculateGrade {

	public static void main(String[] args) {

		grade(50, 50, 50);
	}

	public static void grade(int a, int b, int c) {
		double avarage = (a + b + c) / 3;

		if (avarage >= 90 && avarage <= 100) {
			System.out.println("Your grade is A");
		} else if (avarage >= 80 && avarage <= 89) {
			System.out.println("Your grade is B");
		} else if (avarage >= 70 && avarage <= 79) {
			System.out.println("Your grade is C");
		} else if (avarage >= 60 && avarage <= 69) {
			System.out.println("Your grade is D");
		} else if (avarage >= 0 && avarage <= 59) {
			System.out.println("Your grade is F");
		} else {
			System.out.println("error");
		}
	}

}
