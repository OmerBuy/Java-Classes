package day14_methods_part2;

public class task67_lastDigit {

	public static void main(String[] args) {

		if(lastDigit(15,28)) {
			System.out.println("Same");
		}else {System.out.println("Not Same");
		}
	}

	public static boolean lastDigit(int num1,int num2) {
		if(num1%10==num2%10) {
			return true;}
		else {
			return false;}
		
		
	}
}
