package day10_controlFlowStatements_Part4;

public class task45 {

	public static void main(String[] args) {

		int x = 50;
		int y = 10;
		int repeat = 3;

		for (int i = 1; i <= repeat; i++){

			if (x > y) {
				System.out.println("x greater than y");
			} else if (x < y) {
				System.out.println("y greater than x");
			} else if (x == y) {
				System.out.println("numbers are equal");
			}
		}
	}

}
