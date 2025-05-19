package homework_loop;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.print("1~50 사이의 정수를 입력하세요: ");
			int num = sc.nextInt();
			
			if (num < 1 || num > 50) {
				continue;
			} else {
				for (int i = 1; i <= num; i++) {
					sum += i;
				}
			}
			System.out.println("정수(1~50) : " + num);
			System.out.println("합계 : " + sum);
			break;
		}
	}
}
