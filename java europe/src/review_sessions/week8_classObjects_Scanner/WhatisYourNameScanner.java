package review_sessions.week8_classObjects_Scanner;

import java.util.Scanner;

public class WhatisYourNameScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	     
		System.out.println("What is your name?");
		
		String name = sc.next();
		
		System.out.println("My name is "+name);

		sc.close();
	}

}
