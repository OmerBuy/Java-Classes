package day29_arrays_lab3;

public class Question27 {

	public static void main(String[] args) {

		int[] x = {1,4,5,6,2}; //true
		int[] y = {1,2,3}; //true
		int[] z = {1,2,4,5,8,9}; //false
		
		System.out.println(tripleUp(x));
		System.out.println(tripleUp(y));
		System.out.println(tripleUp(z));
		
	}

	public static boolean tripleUp(int[] nums) {
		
		boolean prevUp = false;
		
		for (int i = 0; i < nums.length - 1; i++) {
			
			if (nums[i + 1] - nums[i] == 1) {
				
				if (prevUp) {
					return true;
				}else {
					prevUp = true;
					}
			} else
				prevUp = false;
		}
		return false;
	}
}
