package day19_stringManipulation_part1;

import java.util.Scanner;

public class task77_Emoji {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Emoji");
		String emoji = sc.next();

	

		if (emoji.length() != 2) {
			System.out.println("invalid emoji");
			return; // stop execution
		}
		// if code reaches this point, then emoji is 2 chars
		// get first and second chars and assign to variables

		char first = emoji.charAt(0);
		char second = emoji.charAt(1);

		if (first == ':') {
			if (second == ')') {
				System.out.println("Smile");
			} else if (second == '(') {
				System.out.println("Sad");
			} else if (second == '/') {
				System.out.println("Upset");
			} else {
				System.out.println("Unknown emoji");
			}

		} else if (first == ';') {
			if (second == ')') {
				System.out.println("Wink");
			} else if (second == '0') {
				System.out.println("Suprised");
			} else {
				System.out.println("Unknown emoji");
			}
		}else {
			System.out.println("invalid");
		}
	}
}
