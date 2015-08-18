package di;


public class MyMessageSender {
	MessageService ms;

	public MessageService getMs() {
		return ms;
	}

	public void setMs(MessageService ms) {
		this.ms = ms;
	}
	public void sendMsg()
	{
		ms.sendMessage("sushma", "hi");
	}
}
