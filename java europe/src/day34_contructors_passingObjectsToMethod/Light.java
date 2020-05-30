package day34_contructors_passingObjectsToMethod;

public class Light {

	
	int noOfWatts;
	boolean indicator;
	String location;
	
	public Light() {
		this(0,false);
		System.out.println("Returning from no-argument constructor no.1");
	}

	public Light(int watt, boolean ind) {
		this(watt,ind,"X");
		System.out.println("Returning from constructor no.2");

	}

	public Light(int noOfWatts, boolean indicator, String location) {

		System.out.println("Returning from constructor no.3");
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
	}
	
	
	
	
	
	
	
	
	
	
}
