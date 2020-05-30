package review_sessions.week8_classObjects_Scanner;

public class Product {

	String title;
	double price;
	int rating;
	String seller;
	
	//custom method to act as bahavior for Product class
	
	public void displayInfo() {
		
		System.out.println("-----Product Info------");
		System.out.println("title = " + title);
		System.out.println("price = $ " + price);
		System.out.println("rating = " + rating);
		System.out.println("seller = " + seller);

}
}