package day4_arithmeticOperators;

public class additionConcat {

	public static void main(String[] args) {
		
			//Number + Number=Addition
		System.out.println(2+2);
		System.out.println(20+200);
		
			//NumberString : Concatenation
		System.out.println(5+ "hello");
		
		//String+Boolean :Concatenation
		System.out.println("hello" + true);
		 
		//String+String : Concatenation
		System.out.println("hello"+"world");
		
		//boolean+number
		//System.out.println(true+1);
		
		System.out.println(2+0+3+"Cybertek"); 			//5Cybertek
		System.out.println("Cybertek"+2+0+5);			//Cybertek205
		System.out.println(2+0+5+"Cybertek"+2+0+5);		//7Cybertek205
		System.out.println(2+0+5+"Cybertek"+(2+0+1));	//7Cybertek3
	
	
	}

}
