package day28_arrays_lab2;

import java.util.Arrays;

public class Question9 {

	public static void main(String[] args) {

		int[] x = {1,2,4,5,6};
		
		System.out.println(Arrays.toString(makeLast(x)));
	}

	public static int[] makeLast(int [] arr) {
		
		int [] newArray = new int[2*arr.length];
		
		newArray[newArray.length-1] = arr[arr.length-1];
		
		return newArray;
		
	}
	
	
}
