package sec04.exam05.quiz.quiz1;

public class Calculator {

	
	
	int getEvenTotal(int begin, int end) {
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			if (i % 2 == 0) {
			sum += i;
			}
		}
//		for (; begin <= end; begin++) {
//			if (begin % 2 == 0) {
//				sum += begin;
//			}
//		}
		return sum;
	}
	
}
