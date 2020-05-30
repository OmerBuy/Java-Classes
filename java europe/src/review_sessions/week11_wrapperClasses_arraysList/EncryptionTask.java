package review_sessions.week11_wrapperClasses_arraysList;

public class EncryptionTask {

	public static void main(String[] args) {

		// create a method that accepts a string and return encryted string

		System.out.println(encrypted("cybertek"));
	}

	public static String encrypted(String word) {

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";
		String dummy = "";

		for (int i = 0; i < word.length(); i++) {

			// 1.Read a letter from word
			char myLetter = word.charAt(i); // j

			// 2.Find the position/index of myLetter in alphapet and save it into iidx
			int iidx = alphabet.indexOf(myLetter); // 9 //0

			// 3.Read the letter from encrypted and store into char
			char dec = encrypted.charAt(iidx); // q //z

			dummy = dummy + dec; // qz

		}

		return dummy;

	}

}
