package day29_arrays_lab3;

import java.util.Arrays;

public class Question28 {

	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(fizzArray3(5, 10)));
		
		
	}

	public static int[] fizzArray3(int start, int end) {
	    
		int[] arr = new int[end - start];
	    
	    for(int i = start; i < end; i++)
	        
	    	arr[i - start] = i;
	              
	    return arr;
	    
	}
	
}
