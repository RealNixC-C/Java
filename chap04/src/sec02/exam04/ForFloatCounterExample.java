package sec02.exam04;

import java.util.Iterator;

public class ForFloatCounterExample {

	public static void main(String[] args) {

		// 잘못 작성된 for문의 예
		for (float  i = 0.1f; i < 1.0f; i+= 0.1f) {
			System.out.println(i); // 10번 반복을 기대하지만 실제로는 9번 반복
			// 이유? i에 0.1씩 더할 때 정확하게 0.1이 더해지는 것은 아님
			// float의 0.1은 정학한 0.1이아니라 근사값
		}
		// 초기화식에 사용되는 변수는 정수 타입을 쓰는게 좋음
	}

}
