package day29_arrays_lab3;

public class Question25 {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };
		int[] y = { 2, 3, 10 };

		System.out.println(matchUp(x, y));
	}

	public static int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		int diff;
		for (int i = 0; i < nums1.length; i++) {
			diff = Math.abs(nums1[i] - nums2[i]);
			if (diff <= 2 && diff != 0)
				count++;
		}
		return count;
	}
}
