package day28_arrays_lab2;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };
		int[] y = { 17, 12, 10, 8 };
		int[] a = { 7, 0, 0 };

		System.out.println(Arrays.toString(rotateLeft(y)));
	}

	public static int[] rotateLeft(int[] arr) {

		int x = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = x;

		return arr;

	}
}
