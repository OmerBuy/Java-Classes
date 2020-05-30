package review_sessions.week8_classObjects_Scanner;

public class AmazonShop {

	public static void main(String[] args) {

		
		//Declare 2 product objects
		
		Product proObj1 = new Product();
		Product proObj2 = new Product();
	
		//assign values to proObj1
		
		proObj1.title = "Spoon";
		proObj1.price = 5;
		proObj1.rating = 4;
		proObj1.seller = "SpoonSeller";
		
		System.out.println(proObj1.title);
		System.out.println(proObj2.title); //default
		
		//assign values to proObj2
		
		proObj2.title = "Gloves";
		proObj2.price = 10;
		proObj2.rating = 5;
		proObj2.seller = "AmazonSeller";
		
		proObj1.displayInfo();
		proObj2.displayInfo();
	}

}
