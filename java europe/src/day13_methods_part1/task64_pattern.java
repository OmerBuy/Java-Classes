package day13_methods_part1;

public class task64_pattern {

	public static void main(String[] args) {
		pattern(5);
	}

	public static void pattern(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}
}
