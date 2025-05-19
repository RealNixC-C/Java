package homework_loop;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		for (;;) {
			System.out.print("입력 : ");
			String str = scanner.nextLine();
			System.out.println(str);
			
			if (str.equals("탈출")) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
