package day13_methods_part1;

public class task56_convertMiles {

	public static void main(String[] args) {
		convertKM();

	}

	public static void convertKM() {
		double kms;
		double miles=80;
		kms=1.60934*miles;
		System.out.println(miles+" mile = "+kms+" km");
	}

}
