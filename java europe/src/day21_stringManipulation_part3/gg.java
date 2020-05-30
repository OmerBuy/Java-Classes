package day21_stringManipulation_part3;

public class gg {

	public static void main(String[] args) {

		String s =" ";
		String c = s+ "hello"+s+s;
		c.concat("world");
		String t = c.trim();
		
		System.out.println(t.length());
		
		
		
	}

}
