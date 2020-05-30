package day13_methods_part1;

public class task62_GreatestNum {

	public static void main(String[] args) {

		greatest(5,4,7);
		
	}

	public static void greatest(int num1,int num2,int num3) {
		if(num1>num2 && num1>num3) {
		System.out.println("Greatest "+ num1);}
		else if (num2>num1 && num2>num3) {
			System.out.println("Greatest "+ num2);}
			else if (num3>num1 && num3>num2 ) {
				System.out.println("Greatest "+ num3);}
				else {System.out.println("All of them equal");
		}
		
	}
}
