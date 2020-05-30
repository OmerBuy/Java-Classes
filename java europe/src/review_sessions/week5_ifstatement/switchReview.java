package review_sessions.week5_ifstatement;

public class switchReview {

	public static void main(String[] args) {
		int condition=1;
		switch (condition){
		case 1:
			System.out.println("very bad");
			break;
		case 2: case 3:
			System.out.println("bad");
			break;
		case 4:
			System.out.println("ok");
			break;
		case 5:
			System.out.println("good");
		default:
			System.out.println("Invalid selection");
	}
	}

}
