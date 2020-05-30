package day13_methods_part1;

public class task59_paycalculator {

	public static void main(String[] args) {

		payCalculator(80, 20);
		payCalculator(37, 62.50);
		
		
	}

	public static void payCalculator(double hours,double hourlyPay) {
		
		double pay = hours * hourlyPay;
		System.out.println(pay);
	}
}
