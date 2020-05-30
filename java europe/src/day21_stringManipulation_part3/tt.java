package day21_stringManipulation_part3;

public class tt {

	public static void main(String[] args) {

		
		String b ="rumble";
		b+=b.concat("4").substring(3,b.length()-1);
		System.out.println(b);
	}

}
