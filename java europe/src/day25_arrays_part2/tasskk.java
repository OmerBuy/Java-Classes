package day25_arrays_part2;

import java.util.Scanner;

public class tasskk {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Duydugun ses veya sesler neydi bro ?\n\nLutfen aralarina bir bosluk koyarak yazarmisin? ");

		String in = sc.nextLine();

		String[] sesler = in.toLowerCase().split(" ");
		

		for (int i = 0; i < sesler.length; i++) {

			switch (sesler[i]) {

			case "grr" :
				System.out.print("Lion ");
				break;

			case "rawr":
				System.out.print("Tiger ");
				break;

			case "ssss":
				System.out.print("Snake ");
				break;

			case "chirp":
				System.out.print("Bird ");
				break;

				
			}

		}
	}

}
