package day14_methods_part2;

public class Labs_Question1 {

	public static void main(String[] args) {

		stringTimes("Hi",5);
		
	}

	
	public static void stringTimes(String string,int number) {
		
		String str="";
		
		for(int i=0;i<number;i++) {
			
			str = str + string;
		}
		System.out.print(str);
	}
}

	