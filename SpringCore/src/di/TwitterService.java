package di;

public class TwitterService implements MessageService {
	@Override
	public void sendMessage(String receiverName, String msg) {
		System.out.println("Twitter message: "+msg + " by"+receiverName+" via twitter");
		
	}
}
