package review_sessions.week12_arraysList;

import java.util.ArrayList;

public class MethodsReturnArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> x = getIntList(6);
		System.out.println(x);
		
	}

	public static ArrayList<Integer> getIntList(int size) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i=0;i<=size;i++) {
			numbers.add(i);
		}
		return numbers;
		
	}
}
