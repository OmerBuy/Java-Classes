package day25_arrays_part2;

import java.time.Year;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		RainFall Year2012 = new RainFall();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 13; i++) {
			System.out.print("Rain amount of " + Year2012.getaylar(i) + ": ");
			double g = sc.nextDouble();
			Year2012.setRain(g, i);
		}

//		
//		System.out.print("Enter ur rain amaunt : ");
//		
//		
//		Year2012.setRain(6, 2);
//		Year2012.setRain(7, 3);
//		Year2012.setRain(8, 4);
//		Year2012.setRain(1, 5);
//		Year2012.setRain(6, 6);
//		Year2012.setRain(4, 7);
//		Year2012.setRain(15, 8);
//		Year2012.setRain(-2, 9);
//		Year2012.setRain(6, 10);
//		Year2012.setRain(4, 11);
//		Year2012.setRain(3, 12);

		System.out.printf("\nOrtalama yagis miktari\t: %.2f\nMinumum yagis miktari\t: %.2f\nMaksimum yagis miktari\t: %.2f\nToplam yagis miktari\t: %.2f\n",
				Year2012.getAvarage(), Year2012.getMinRain(), Year2012.getMaxRain(), Year2012.totalrainfall());

	}

}
