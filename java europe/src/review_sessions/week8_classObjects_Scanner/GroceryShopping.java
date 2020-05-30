package review_sessions.week8_classObjects_Scanner;

import java.util.Scanner;

public class GroceryShopping {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome");
	System.out.println("how much");
	double price1 = sc.nextDouble();

	System.out.println("How much are egg");
	double price2 = sc.nextDouble();

	double totalPrice = price1 + price2;
	System.out.println("total is : $"+totalPrice);
		
		
	}

}
