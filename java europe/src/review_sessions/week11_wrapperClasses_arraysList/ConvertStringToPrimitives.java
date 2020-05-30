package review_sessions.week11_wrapperClasses_arraysList;

public class ConvertStringToPrimitives {

	public static void main(String[] args) {		//Convert any String to Primitives
			
		boolean b1 = Boolean.parseBoolean("true");

		byte byteValue = Byte.parseByte("100");

		short shortValue = Short.parseShort("10000");

		int intValue = Integer.parseInt("500");

		double doubleValue = Double.parseDouble("243.4");

		if (doubleValue > 155) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
	}
}
