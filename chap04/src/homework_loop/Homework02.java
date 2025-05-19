package homework_loop;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("정수를 입력하세요: ");
			int num = scanner.nextInt();

			if (num < 0) {
				System.out.println("양수만 입력해주세요.");
				continue;
			} else if (num > 9) {
				System.out.println("9이하의 숫자를 입력해주세요.");
				continue;
			} else if (num == 0) {
				break;
			} else {
				for (; num <= 9; num++) {
					System.out.println("=== " + num + "단 ===");
					for (int i = 1; i <= 9; i++) {
						System.out.println(num + "*" + i + "=" + (num * i));
					}
					System.out.println();
				}
			}
		}

		System.out.println("프로그램이 종료되었습니다.");
	}
}
