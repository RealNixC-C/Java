package sec01.homework_string.homework04;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String sumStr = "";
		
		while(true) {
			System.out.print("문자열 : ");
			String userInput = sc.nextLine();
			
			if(userInput.equalsIgnoreCase("n")) { 
				System.out.println("프로그램을 종료합니다.");
				System.out.println("최종 문자열 : " + sumStr);
				return;
			}
			sumStr += userInput;
		}
		
		
	}

}
