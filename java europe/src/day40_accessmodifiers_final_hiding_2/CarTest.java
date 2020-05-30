package day40_accessmodifiers_final_hiding_2;

import day40_accessmodifiers_final_hiding.Car;

public class CarTest {

	public static void main(String[] args) {

		Car c = new Car();

		
		//c.model = "M3";
		c.year = 2020;
		//c.door = 4;
		//c.engine = 2000;
		
		System.out.println(c.toString());
		
	}

}
