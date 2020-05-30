package day25_arrays_part2;

public class RainFall {

	double rain;
	static double[] months = new double[13];
	static double avarage;
	static double maxRain;
	static double minRain;
	static String[] aylar = new String[13];

	public static String getaylar(int i) {
		aylar[1] = "Jan";
		aylar[2] = "Feb";
		aylar[3] = "Mar";
		aylar[4] = "Apr";
		aylar[5] = "May";
		aylar[6] = "Jun";
		aylar[7] = "July";
		aylar[8] = "Agu";
		aylar[9] = "Sept";
		aylar[10] = "Oct";
		aylar[11] = "Nov";
		aylar[12] = "Dec";
		return aylar[i];
	}

	public static double getMaxRain() {

		int ay = 0;

		maxRain = 0;
		for (int i = 1; i < months.length; i++) {
			maxRain = Double.max(maxRain, months[i]);
			if ((maxRain == months[i])) {
				ay = i;
			}
		}
		System.out.print("The most Rainy Month is " + aylar[ay]);
		return maxRain;
	}
	public static double getMinRain() {
		minRain = months[1];
		for (int i = 1; i < months.length; i++) {
			minRain = Double.min(minRain, months[i]);
		}
		return minRain;
	}
	public static double getAvarage() {

		avarage = totalrainfall() / 12;

		return avarage;
	}
	public static double totalrainfall() {
		double totalrain = 0;
		for (int i = 1; i < months.length; i++) {

			totalrain = totalrain + months[i];
		}
		return totalrain;
	}
	public double getRain(int i) {

		if (i > 12 || i < 1) {
			System.out.println("Wrong month value");
		}
		return months[i];
	}
	public void setRain(double rain, int i) {

		if (i > 12 || i < 1 || rain < 0) {
			System.out.println("Wrong month or rain value " + i + " month");
		} else {
			months[i] = rain;
		}
	}
}
