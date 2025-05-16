package sec02.exam03;

import java.util.Scanner;

public class ForSumForm1To100Example2 {

	public static void main(String[] args) {

		// 1부터 100까지 합을 반복해서 출력
		int sum = 0;
		int i = 0;
		
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i - 1) + " 합:" + sum);
		
		// (참고) 무한 루프
		int count = 0;
		for (;;) {
			System.out.println("무한 반복");
			count++;
			//실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (count == 6) {
				break;
			}
		}
		
		// Quiz: 1부터 100까지 짝수의
		
		int sum2 = 0;
		for (int j = 1; j <= 100; j++) {
			if(j % 2 == 0) {
				sum2 += j;
			}
		}
		System.out.println(sum2);
		
		
		// Quiz2: 
//		숫자를 입력받아 입력받은 수가 
//		짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//		홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//		을 구하는 프로그램을 구현하시오
//
//		[입력]  [출력]
//		 10  => 30
//		 11  => 36
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		
		int total = 0;
		
		// for문 먼저 사용
		for (int n = 1; n <= num; n++) {
			if (num % 2 == 0) {
				if (n % 2 == 0) {
					total += n;
				}
			} else if (num % 2 == 1) {
				if (n % 2 == 1) {
					total += n;
				}
			}
		}
		System.out.println(total);
		
		// if문 먼저 사용
//		if (num % 2 == 0) { // 짝수인 경우
//			for(int y = 2; y <= num; y += 2) {
//				total += y;
//			}
//		} else { // 홀수인경우
//			for ( int y = 1; y <= num; y += 2) {
//				total += y;
//			}
//		}		
//		System.out.println(sum);
		
		
		
		
		
		
		
	}

}
