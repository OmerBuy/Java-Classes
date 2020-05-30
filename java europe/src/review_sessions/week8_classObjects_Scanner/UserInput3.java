package review_sessions.week8_classObjects_Scanner;

import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first num");

		int num1 = sc.nextInt();

		System.out.println("Enter sec num");

		int num2 = sc.nextInt();
		
		sc.nextLine(); // you need to do this for String

		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		System.out.println("Output: "+num1+"|"+num2+"|"+str);
		
	}

}
