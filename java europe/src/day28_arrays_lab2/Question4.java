package day28_arrays_lab2;

public class Question4 {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };
		int[] y = {2,3,5};
		int[] z = {1,2,1};
		int[] k = {11,2,13,3,2};
		
		System.out.println(sum(x));

	}

	public static int sum(int[] arr) {

		int sum = 0;

		for (int value : arr) {

			sum = sum + value;
		}
		return sum;
	}
}
