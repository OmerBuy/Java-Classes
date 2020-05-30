package day24_arrays_part1;

public class task90_carArray {

	public static void main(String[] args) {

		String car[] = { "Toyota", "Ferrari", "Nissan", "BMW", "Mercedes", "Honda" };

		boolean flag = false;

		for (int i = 0; i < car.length; i++) {

			if (car[i].equals("Honda")) {

				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("found it");
		} else {
			System.out.println("Not found it");
		}
	}

}
