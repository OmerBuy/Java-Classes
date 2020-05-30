package day34_contructors_passingObjectsToMethod;

public class CarpetTest {

	public static void main(String[] args) {

//		Floor f1= new Floor(10,12);
//		Carpet c1 = new Carpet(8);
		
		Calculator cal = new Calculator(new Floor(10,12), new Carpet(9));
		
		double cost= cal.getTotalCost();
		
		System.out.println(cost);
		
		
	}

}
