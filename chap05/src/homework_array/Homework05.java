package homework_array;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String[] choices = { "가위", "바위", "보" };
		int total = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;

		while (true) {

			System.out.print("가위바위보 : ");
			String user = scanner.nextLine();
			if ("stop".equals(user)) {
				break;
			}
			if (!("가위".equals(user) || "바위".equals(user) || "보".equals(user))) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			int userRpc = 0;

			switch (user) {
			case "가위":
				userRpc = 0;
				break;
			case "바위":
				userRpc = 1;
				break;
			case "보":
				userRpc = 2;
				break;
			}

			int computerRpc = (int) (Math.random() * 3);
			String computer = "";
			switch (computerRpc) {
			case 0:
				computer = choices[0];
				break;
			case 1:
				computer = choices[1];
				break;
			case 2:
				computer = choices[2];
				break;
			}

			System.out.println("컴퓨터 : " + computer);
			System.out.println("사용자 : " + user);

			if (userRpc == computerRpc) {
				System.out.println("비겼습니다");
				draw++;
			} else if ((userRpc == 0 && computerRpc == 2) || 
					   (userRpc == 1 && computerRpc == 0) || 
					   (userRpc == 2 && computerRpc == 1)) {
				System.out.println("이겼습니다 !");
				win++;
			} else {
				System.out.println("졌습니다 ㅠㅠ");
				lose++;
			}
			total++;
			
			System.out.println();
		}
		
		System.out.println(total + "전 " + win + "승 " + draw + "무 " + lose + "패");

	}

}
