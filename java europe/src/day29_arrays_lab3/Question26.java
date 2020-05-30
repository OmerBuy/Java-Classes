package day29_arrays_lab3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question26 {

	public static void main(String[] args) {

		ArrayList<Integer> y = new ArrayList<>(); // false
		y.add(2);
		y.add(2);
		y.add(2);
		y.add(4);
		y.add(5);
		y.add(5);
		
		int x = 0;
		int z = 0;

		for (int i = 0; i < y.size(); i++) {
			if (Collections.frequency(y, y.get(i)) > 1) {
				//System.out.println(y.get(i) + "x" + Collections.frequency(y, y.get(i)));
				//System.out.println(y.get(i));
			
				x = y.get(i);
				z = Collections.frequency(y, y.get(i));
			}
			if((i+1) < (y.size()-1)) {
			
				if(x == y.get(i+1))
				{
					System.out.println(x+ "x" + z);
				}
			
			}
			
		}
		
	}
}