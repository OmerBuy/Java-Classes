package day23_stringManipulation_Lab2;

import java.util.Random;

public class task85_ {

	public static void main(String[] args) {

//		Random rn = new Random();
//		int computerDice;
//		int userDice;
//		int computerPoints = 0;
//		int userPoints = 0;
//
//		for (int i = 0; i < 10; i++) {
//
//			computerDice = rn.nextInt(6) + 1;
//			userDice = rn.nextInt(6) + 1;
//
//			if (computerDice > userDice) {
//				computerPoints++;
//			} else if (userDice > computerDice) {
//				userPoints++;
//			}
//		}
//
//		System.out.println("Computer point is:" + computerPoints);
//		System.out.println("User point is:" + userPoints);
//
//		if (computerPoints > userPoints) {
//			System.out.println("Computer wins");
//		} else if (userPoints > computerPoints) {
//			System.out.println("User wins");
//		} else {
//			System.out.println("There is no winner");
//		}

		Random rn = new Random();
		Random pc = new Random();
		int countp=0;
		int countr=0;
		for(int i=0; i<10; i++) {
			int pc1 =pc.nextInt(6)+1;
			System.out.println(pc1);
			int rn1 =rn.nextInt(6)+1;
			System.out.println(rn1);
	
			if(pc1>rn1) {
				System.out.println("PC WINS ");
				countp++;
			}else if(pc1==rn1){
				System.out.println("There is no winner");
				
			}else {
				System.out.println("YOU WIN");
				countr++;
			}
			
		}
		System.out.println("In total PC wins "+ countp + " and You win "+ countr);
		if(countp>countr) {
			System.out.println("Winner is PC");
		}else {
			System.out.println("Congs, winner is YOU");
	}

}
}
