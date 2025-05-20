package sec04.exam01;

public class Calculator {

	// 메소드
	void powerOn() {
		System.out.println("전원을 컵니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double divide(int x, int y) { // 매개변수값으로 double을 받아도됨
		double result = (double)x / y;
		return result;
	}
	
	
	

}
