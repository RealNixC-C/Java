package sec01.exam08;

public class SystemTimeExample {

	public static void main(String[] args) {

		// 1부터 100만까지 합을 구하는데 걸리는 시간 측정
		long time1 = System.nanoTime(); // 시작 시간
//		long time3 = System.currentTimeMillis(); // 시작 시간
		System.out.println(time1);
		
		int sum = 0;
		for (int i = 1; i < 1000000; i++) {
			sum += i;
			
		}
		
		long time2 = System.nanoTime(); // 끝 시간
//		long time4 = System.currentTimeMillis(); // 시작 시간
		System.out.println(time2);
		
		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다.");
//		System.out.println("계산에 " + (time4 - time3) + " 밀리초가 소요되었습니다.");
		
		// 주로 실행 시간(성능) 측정할 때 사용
		
	}

}
