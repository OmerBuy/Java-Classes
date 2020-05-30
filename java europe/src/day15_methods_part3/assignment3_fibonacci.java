package day15_methods_part3;

public class assignment3_fibonacci {

	public static void main(String[] args) {

		int count=8;
		int pre1=0;int pre2=1;
		System.out.println("Fibonacci serios of "+count+" numbers");
		
		for(int i=1;i<=count;i++) {
			
			System.out.print(pre2+" ");
			
			//on each iteration, we are assigning second number to the first number and
			//assigning the sum of last 2 numbers to the second number
			
			int sumOfPreTwo= pre1+pre2;
			pre1=pre2;
			pre2=sumOfPreTwo;
			
		}
	
	}

	
}
