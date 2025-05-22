package sec02.exam03_not;

// 다형서 없이 if-else if 문으로 구현
public class PaymentService {
	
	public void pay(String type, int amount) {
		if ("card".equals(type)) {
			System.out.println("카드 결제 선택됨");
			System.out.println("카드사 승인 요청 중...");
			System.out.println("카드로 " + amount + " 원 결제 완료");
		} else if ("paypal".equals(type)) {
			System.out.println("Paypal 결제 선택됨");
			System.out.println("Paypal 서버와 연결 중...");
			System.out.println("Paypal로 " + amount + " 원 결제 완료");
		} else if ("bank".equals(type)) {
			System.out.println("계좌이체 결제 선택됨");
			System.out.println("가상 계좌로 입금 확인 중...");
			System.out.println("계좌이체로 " + amount + " 원 결제 완료");
		} else {
			System.out.println("지원하지 않는 결제 수단입니다.");
		}
	}
}
