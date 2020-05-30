package day28_arrays_lab2;

import java.util.Arrays;

public class Question6k {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3333, 5, 6, 55 };

		System.out.println(Arrays.toString(greatestElement(x)));

	}

	public static int[] greatestElement(int[] arr) {

		Arrays.sort(arr);

		int max = arr[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = max;
		}

		return arr;
	}
}
