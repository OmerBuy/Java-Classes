package review_sessions.week11_wrapperClasses_arraysList;

public class VotingCheck {

	public static void main(String[] args) {

		// int age = 10;

		checkIfCanVote(1900);

	}

	public static void checkIfCanVote(int birthYear) {

		if (printAge(birthYear) >= 18) {
			System.out.println("Eligible for vote");
		} else {
			System.out.println("Not eligible for vote");

		}
	}

	public static int printAge(int birthYear) {

		int age = 2020 - birthYear;

		return age;

	}

}
