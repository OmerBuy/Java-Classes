package day28_arrays_lab2;

import java.util.Arrays;

public class Question15 {

	public static void main(String[] args) {

		int[] x = {1,2,3,4};
		int[] y = {1,2,3};
		int[] z = {8,6,7,9,5};
		
		System.out.println(Arrays.toString(swapEnds(x)));
	}

	public static int[] swapEnds(int[] arr) {

		int temp = 0;
		temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		
		return arr;
		
		
		
	}

}
