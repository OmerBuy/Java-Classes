package day14_methods_part2;

public class Question3_specialEleven {

	public static void main(String[] args) {
		// We`ll say a num is special if it is a multiple of 11 or
		// if it is one more than a multiple of 11.
		// Write a method that accepts a num and prints true if the given num is special
		
		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
		
	}
	
	public static void specialEleven(int number) {
		
		if(number%11==0 || (number+1)%11==0 || number%11==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
			
		}
		
	}
}
