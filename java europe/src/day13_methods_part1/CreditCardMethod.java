package day13_methods_part1;

public class CreditCardMethod {

	public static void main(String[] args) {

		double salary = 50000;
		int creditRating = 5;

		if (salary >= 20000 && creditRating >= 7) {
			qualify();
		} else {
			nuQualify();
		}

	}

	public static void nuQualify() {
System.out.println("I am sorry, you are not qualified for the CC");		
	}

	public static void qualify() {
		System.out.println("Congrat, you are qualified for the CC");		
		
	}

}
