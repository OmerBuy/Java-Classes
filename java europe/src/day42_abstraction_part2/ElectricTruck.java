package day42_abstraction_part2;

public abstract class ElectricTruck extends ElectricCar {

	public ElectricTruck(String model, double price, String color) {
		super(model, price, color);
	
	}
	
	public abstract void load (String item);

}

	

