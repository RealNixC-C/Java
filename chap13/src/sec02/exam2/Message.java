package sec02.exam2;

public class Message {

	public String command; // 메세지를 어떻게 처리할지
	public String to; // 누구에게 보낼지
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
