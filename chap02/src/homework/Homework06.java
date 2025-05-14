package homework;

import java.util.Scanner;

public class Homework06 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요: ");
		char charNum = scanner.nextLine().charAt(0);
		
		int charToInt = charNum - '0';
	
		int multiple = charToInt * charToInt;
		
		System.out.println("입력한 숫자의 제곱은 " + multiple + "입니다.");
		
		
		// git 설정
		// git push 설정하기
	
		
		
		
	}
}
