package review_sessions.week12_arraysList;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<>();
		cities.add("Mclean");
		cities.add("Arlington");
		cities.add("Baltimore");
		cities.add("Fairfax");
		cities.add("Falls Church");
		cities.add("London");
		cities.add("Berlin");
		cities.add("Amsterdam");
		cities.add(0,"Istanbul");
		cities.add(1,"Reston");
		
		System.out.println(cities);
		
		cities.add(2,"Ankara");
		System.out.println(cities);
		
		cities.set(4, "New York");
		System.out.println(cities);
		
		cities.remove(3);
		System.out.println(cities);
		
		cities.remove("Ankara");
		System.out.println(cities);
	}

}
