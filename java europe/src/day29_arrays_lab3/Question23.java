package day29_arrays_lab3;

import java.util.Arrays;

public class Question23 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(fizzyArray(8)));
		
		
	}

	public static int[] fizzyArray(int x) {
		
		int[] array = new int [x];
		
		for(int i=0;i<array.length;i++) {
			array[i]=i;
		}
		return array;
	}
	
}
