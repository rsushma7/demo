package di;

public class WhatsAppService implements MessageService {

	@Override
	public void sendMessage(String receiverName, String msg) {
		System.out.println("Whatsapp message: "+"Message"+msg + " by"+receiverName);
		
	}
}