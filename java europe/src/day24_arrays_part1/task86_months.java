package day24_arrays_part1;

import java.util.Scanner;

public class task86_months {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String [] months = new String [12];
		
		months [0]="Jan";
		months [1]="Feb";
		months [2]="Mar";
		months [3]="Apr";
		months [4]="May";
		months [5]="Jun";
		months [6]="July";
		months [7]="Agu";
		months [8]="Sept";
		months [9]="Oct";
		months [10]="Nov";
		months [11]="Dec";
		
		System.out.println("Enter ur month index number : ");
		int i = sc.nextInt();
		
		System.out.println("The month is "+months[i]);
		
	
		
		sc.close();
	}

	
}
