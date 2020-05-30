package day6_logicalOperators;

public class operatorPrecedence {

	public static void main(String[] args) {
		
		int applesCount = 20;
		int orangesCount = 30;
		int pearsCount = 30;
		
		boolean comp =applesCount<orangesCount||orangesCount>=pearsCount;
		
		// 20<30 || 30>=30   T ||----------- = T
		
		System.out.println(comp);
		
		System.out.println("***********************");
		
		String outsideWeather;
		int degree;
		outsideWeather="Shinny";
		degree=70;
		
		boolean comp2 = (!(outsideWeather=="Rainy" || degree==70)); //(!(f||t)  false
		System.out.println(comp2);

		int b = 2;
		boolean res = ++b ==2 || --b == 2 && --b == 2; 
		//b in memory : 2   3     2     1
		//res		  : 3==2  || 2 == 2 && 1 ==2;  //F || T && F  // F||F //F
		
		System.out.println(res);
		System.out.println("***********************");

		boolean x = true, z = true;
		int y = 20;
		x = (y!=10)||(z=false);
		
		System.out.println(x);
		
		System.out.println("***********************");
//TASK 23
		double d1 =20;
		double d2 =80;
		double ress = (d1+d2)*25;
		
		double remainder =ress%40;
		
		System.out.println("Remaining total is equal to 20 or less? - "+(3)+(2));
		
	
		
		

	}

}
