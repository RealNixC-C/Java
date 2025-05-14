package homework;

import java.util.Scanner;

public class Homework04 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요: ");
		String letter = scanner.nextLine();
		char charize = letter.charAt(0);
		int unicode = charize;
		
		System.out.println(letter + "의 유니코드 : " + unicode);
		
		
		
		
		
	}
}
