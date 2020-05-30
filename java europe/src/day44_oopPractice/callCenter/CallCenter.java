package day44_oopPractice.callCenter;

public class CallCenter {

	public static void main(String[] args) {

		WhatsApp app = new WhatsApp();
		app.launch();
		app.allOSCompatible = true;
		app.isFree = true;
		app.name = "WhatsApp";
		app.call("OZZY");
		app.sendMessage("Hello");
		app.videoCall();
		app.accept();
		
		VoiceCallable.decline();
		System.out.println(VideoCallable.CAN_CALL);
		
		System.out.println("--------------------------------------------");
		
		VoiceCallable obj = new WhatsApp();  //polymorphic way
		//obj.launch();   
		
		((MessagingApp)obj).launch();
		((MessagingApp)obj).allOSCompatible = false;
		
		obj.call("Mr Tom");
		
		((WhatsApp) obj).videoCall();
		((VideoCallable) obj).videoCall(); //overriding
		
		
		
		
		
		
		
	}

}
