package day44_oopPractice.callCenter;

public class WhatsApp extends MessagingApp implements VideoCallable,VoiceCallable{

	@Override
	public void sendMessage(String msg) {
		System.out.println("Whatsapp - sending a message "+ msg + "...");
	}

	@Override
	public void call(String contact) {
		System.out.println("Whatsapp - calling "+ contact + "...");
	}

	@Override
	public void videoCall() {
		System.out.println("Whatsapp - doing a video call Mr Mike...");		
	}

}
