package sec04.exam04;

public class Calculator {

	// 메소드
	int plus(int x, int y) {
		return x + y;
	}
	
	double avg (int x, int y) {
		double sum = plus(x, y);
		return sum / 2;
	}
	
	void excute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	
	// 내부 호출 연습용
	void println(String message) {
		System.out.println(message);
	}
	
	
	
	
	
	
}
