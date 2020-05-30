package review_sessions.week12_arraysList;

public class AccountTest {

	// Array of objects
	// Unlike traditional array that store values like string, integer,boolean
	// array objects stores Objects. The array elements store the location of the
	// reference variable of the object

	Account obj[] = new Account[2];
	{
		obj[0] = new Account();
		obj[1] = new Account();
		// when there is a class, how you can call the method belong to that class
		// referanceVariable.methodName
		obj[0].setData(1, 2);
		obj[1].setData(3, 4);
		System.out.println("For Array Element 0");
		obj[0].showData();
//			Object x[] = new Object[2];
//			
//			x[0] = new int[2];
//			x[1] = new String[3];
//			
	}
}