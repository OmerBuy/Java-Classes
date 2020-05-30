package day27_arrays_lab;

public class Length {

	public static void main(String[] args) {

		int[][] numbers = {{1,2,3,4},{5,6},{9,10,11,23,30,50,60}};
		
		System.out.println(numbers.length);

		
		//display the number of columns in each row
		
		for(int i=0;i<numbers.length;i++) {
			
			System.out.println("The number of columns in row " + i + " is " + numbers[i].length);
			
		}
		
		System.out.println("---------");
		
		for(int i=0;i<numbers.length;i++) {   
			for(int j=0;j<numbers[i].length;j++) { 
				System.out.println(numbers[i][j]);  
				  
			}
		}

	}

}
