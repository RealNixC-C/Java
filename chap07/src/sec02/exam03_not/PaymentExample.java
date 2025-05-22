package sec02.exam03_not;

public class PaymentExample {

	public static void main(String[] args) {
		
//		PaymentService payment;
//		
//		payment = new CardPayment();
//		payment.pay(50000); // 카드결제
//		
//		payment = new PaypalPayment();
//		payment.pay(30000); // Paypal 결제
//		
//		payment = new BankTransferPayment();
//		payment.pay(20000); // 계좌이체 결제
		
		PaymentService payment = new PaymentService();
		
		payment.pay("card", 50000);
		payment.pay("paypal", 30000);
		payment.pay("bank", 20000);
		
	}
}
	
	// 단점
	// 새로운 결제 방식이 추가되면 if-else 또는 switch에 조건을 계속 추가해야함
	// 확장할 때마다 기존 코드 수정 필요
	// 객체지향적이지 않음, 테스트와 유지보수가 어렵고 유연하지 않음

	// 다형성을 활용하면
	// 유지보수: 새로운 결제 수단 추가 시 기존 코드 수정 없이 자식클래스만 추가
	// 확장성: 객체 교체만으로 기능 변경 가능
	// 가독성: if-else가 없어 깔끔하고 명확
	
	
