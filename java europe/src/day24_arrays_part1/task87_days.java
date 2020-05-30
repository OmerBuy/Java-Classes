package day24_arrays_part1;

import java.util.Scanner;

public class task87_days {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	     

		String [] days = new String [7];
		
		days [0]="Mon";
		days [1]="Tue";
		days [2]="Wed";
		days [3]="Thur";
		days [4]="Fri";
		days [5]="Sat";
		days [6]="Sun";
		
		System.out.println("Enter ur day index : ");
		int i = sc.nextInt();
		
		System.out.println("Today is "+days[i]);
		
		sc.close();
	}

}
