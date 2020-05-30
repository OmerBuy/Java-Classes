package review_sessions.week12_arraysList;

import java.util.ArrayList;

public class ArrayListWriteRead {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
	
	
		nums.add(10);
		nums.add(10);
		nums.add(21);
		nums.add(-7);
	
	System.out.println("numbers of values: "+nums.size());
	System.out.println(nums);
	System.out.println(nums.toString());
	System.out.println(nums.get(3));
	System.out.println("-----------------");
	System.out.println(nums.set(3,1));
	System.out.println(nums);
	
	
	for(int i=0;i<nums.size();i++) {
		nums.get(i);
		System.out.println(i);
	}
	
	
	
	
	}

}
