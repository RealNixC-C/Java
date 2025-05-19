package homework_loop;

import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		stop: while (true) {
			System.out.print("문자열 : ");
			String str = scanner.nextLine();
			System.out.print("문자 : ");
			char charCode = scanner.nextLine().charAt(0);

			int count = 0;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == charCode) {
					count++;
				}
			}

			System.out.println("포함된 개수 : " + count);

			while (true) {
				System.out.print("다시 입력하시겠습니까?");
				char re = scanner.nextLine().charAt(0);
				if (re == 'Y' || re == 'y') {
					break;
				} else if (re == 'N' || re == 'n') {
					break stop;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					continue;
				}
				
			}
		}
		System.out.println("프로그램 종료");
	}
}
