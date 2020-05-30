package day14_methods_part2;

public class task68_yearsUntilRetirement {
//	Write two methods:
//	1-calculateAge(yearBirth); and returns the age
//	2-yearsUntilRetirement(name,year); and displays in the console following: “Mike retires
//	in 36 years”
//	Example: yearsUntilRetirement(“Mike”,1990);
	public static void main(String[] args) {
		yearsUntilRetirement("Mike",1990);
	}
	public static int calculateAge(int yearBirth) {
		int currentYear=2020;
		return currentYear-yearBirth;
	}
	public static void yearsUntilRetirement(String name,int year) {
		System.out.println(name+" retires in "+(66-calculateAge(year)));
	}
	
}
