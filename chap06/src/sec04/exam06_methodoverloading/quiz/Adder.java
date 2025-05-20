package sec04.exam06_methodoverloading.quiz;

public class Adder {

	void add(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("n1 + n2 정수의 합: " + result);
	}
	void add(double n3, double n4) {
		double result = n3 + n4;
		System.out.println("n3 + n4 실수의 합: " + result);
	}
	
}
