package review_sessions.week11_wrapperClasses_arraysList;

public class CastingWithPrimitives {

	public static void main(String[] args) {

		
		int intValue = 123;
		double doubleValue = intValue;		//implicit(automatic) casting
		
		Integer wrapperInt = Integer.valueOf(100);
		Double wrapDouble = (double)wrapperInt;		//Unboxing > casting > Autoboxing
		//Double wrapDouble = wrapperInt;   		//you need to casting manually (wrappers is not have automatic casting)
		
		
		
		
		
	}

}
