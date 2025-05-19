package homework_loop;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		for (;;) {
			System.out.print("숫자(0을 입력하면 종료) : ");
			int num = scanner.nextInt();
			if (num > 0) {
				sum += num;
			}
			if (num == 0) {
				break;
			}
		}
		System.out.println("양수의 합계 : " + sum);
	}

}
