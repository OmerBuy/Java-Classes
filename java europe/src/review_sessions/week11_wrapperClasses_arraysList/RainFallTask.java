package review_sessions.week11_wrapperClasses_arraysList;

import java.util.Scanner;

public class RainFallTask {

	public static void main(String[] args) {

		String[] months = { "Jan", "Feb", "March", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" };
		double[] rain = new double[12];

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter in the following rainfall for the months ahead:");
		System.out.println("Month\tRainfall(In Inches)");

		for (int i = 0; i < months.length; i++) {

			System.out.println(months[i] + " :");

			double val = keyboard.nextDouble();

			while (val < 0) {
				System.out.println("Do not enter a negative number . Re-Enter");
				val = keyboard.nextDouble();
			}

			rain[i] = val;

		}

		System.out.println("The sum of all the rain is: " + getSum(rain) + " inches");
		System.out.println("The average rainfall is: " + getAverage(rain) + " inches");
		// System.out.println("The max rain is:" + getMaxValue(rain) + " inches");
		// System.out.println("The max rain is:" + getMinValue(rain) + " inches");

	}

	public static double getSum(double[] rain) {

		double sum = 0;

		for (double temp : rain) {
			sum = sum + temp;
		}

		return sum;

	}

	public static double getAverage(double[] rain) { // harcoded - we dont like it

		return getSum(rain) / rain.length;

	}

}
