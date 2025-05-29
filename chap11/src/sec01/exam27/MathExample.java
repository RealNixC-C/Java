package sec01.exam27;

public class MathExample {

	public static void main(String[] args) {

		System.out.println("절대값");
		// 절대값 abs
		int v1 = Math.abs(-5); // 절대값
		double v2 = Math.abs(-6.2251);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);

		System.out.println("올림");
		// 올림 ceil
		double v3 = Math.ceil(2.3);
		double v4 = Math.ceil(-2.3);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);
		
		System.out.println("내림");
		// 내림 floor
		double v5 = Math.floor(2.3);
		double v6 = Math.floor(-2.3);
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6);
		
		System.out.println("최대값");
		// 최대값 Max 
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 = " + v7);
		System.out.println("v8 = " + v8);
		
		System.out.println("최소값");
		// 최소값 Min
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 = " + v9);
		System.out.println("v10 = " + v10);
		
		System.out.println("랜덤값");
		// 랜덤값 random 0.0이상 ~ 1미만의 수를 생성
		double v11 = Math.random();
		System.out.println("v11 = " + v11);
		
		System.out.println("가까운 정수의 실수값");
		// 가까운 정수의 실수값 rint
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12 = " + v12);
		System.out.println("v13 = " + v13);
		
		System.out.println("반올림");
		// 반올림 Round  / 반환타입 long
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14 = " + v14);
		System.out.println("v15 = " + v15);
		
		// 소수점 이하 특정 자리에서 반올림
		// 소수점 셋째 자리에서 반올림 12.35
		double value1 = 12.3456 * 100;
		double value2 = Math.round(value1) / 100.0;
		System.out.println(value1);
 		System.out.println(value2);
		
	}

}
