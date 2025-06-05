package sec02.exam2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

//		Queue<Message> messageQueue = new LinkedList<Message>();
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail", "유재석"));
		messageQueue.offer(new Message("sendSMS", "박요한"));
		messageQueue.offer(new Message("sendKakaotalk", "이미주"));
		
		// 메세지가 큐가 비었는지 확인
		while (!messageQueue.isEmpty()) {
			// 메세지 큐에서 1개의 메세지 꺼냄
			Message message = messageQueue.poll();
			
			switch (message.command) {
			case "sendMail": System.out.println(message.to + "님에게 메일을 보냅니다."); break;
			case "sendSMS": System.out.println(message.to + "님에게 SMS을 보냅니다."); break;
			case "sendKakaotalk": System.out.println(message.to + "님에게 카카오톡을 보냅니다."); break;
			}
		}
	}
}
