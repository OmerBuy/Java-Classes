package day13_methods_part1;

public class task61_AgeCalculator {

	public static void main(String[] args) {

		ageCalculator(2020, 1984);
	}

	public static void ageCalculator(int currentYear,int birthyear) {
		int age=currentYear-birthyear;
		
		System.out.println(age);
		
	}
}
