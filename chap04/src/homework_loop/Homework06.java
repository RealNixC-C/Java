package homework_loop;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("게임을 실행합니다!");
			System.out.print("게임을 다시 플레이하시겠습니까?(yes/no) : ");
			String confirm = scanner.nextLine();
			if (confirm.equals("no")) {
				break;
			} else {
				continue;
			}
		} while (true);
		System.out.println("게임을 종료합니다.");
			
	}

}
