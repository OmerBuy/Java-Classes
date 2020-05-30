package day37_inheritance;

import java.util.Scanner;

public class finalExamTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	     
		System.out.println("How many questions are on the final exam?");
		int questions=sc.nextInt();
		
		System.out.println("How many questions did the students miss?");
		int missed=sc.nextInt();
		
		finalExam exam = new finalExam(questions, missed);
		
		System.out.println("The grade for the exam is "+exam.getGrade());
		

	}

}
