package day19_stringManipulation_part1;

import java.util.Scanner;

public class task75_TotalCharacters {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ur first name: ");
		String firstname = sc.next();

		System.out.print("Enter ur last name: ");
		String lastname = sc.next();

		System.out.println("Total characters in ur first and last name is:" + (firstname.length() + lastname.length()));

		sc.close();
	}
}
