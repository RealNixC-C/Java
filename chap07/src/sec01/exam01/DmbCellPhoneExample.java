package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		// DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		// 상속 받은 필드
		System.out.println("모델: " + dmbCellPhone.model); // 부모
		System.out.println("색상: " + dmbCellPhone.color); // 부모
		
		// 자식이 가진 필드
		System.out.println("채널: " + dmbCellPhone.channel); 
		
		// 상속 받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("받았습니다");
		dmbCellPhone.receiveVoice("보냅니다");
		dmbCellPhone.hangUp();
		
		// 자식의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannelDmb(55);
		
	}

}
