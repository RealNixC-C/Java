package homework_loop;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = scanner.nextInt();

		String clap = "";

		if (num <= 0) {
			System.out.println("양수가 아닙니다");
		} else {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					clap += "수";
				} else {
					clap += "박";
				}
			}

		}
		System.out.println(clap);
	}

}
