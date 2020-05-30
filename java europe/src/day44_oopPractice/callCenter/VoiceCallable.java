package day44_oopPractice.callCenter;

public interface VoiceCallable {

	boolean CAN_CALL=true;     //public static final boolean CAN_CALL = true ----- deafault olarak
	
	void call(String contact); //public abstract void------ deafault olarak
	
	//static method
	static void decline() {
		System.out.println("Mike declined voice call...");
	}
	//default method
	public default void accept() {
		System.out.println("Mike finally accept voice call..");	
	}
	
}
