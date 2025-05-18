package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민번호를 (-)  : ");
		char genderByNum = scanner.nextLine().charAt(7);
		int gender = genderByNum - '0';
		
		String result = gender < 0 || gender > 5 ? "잘못된 값" 
				: (gender == 1 || gender == 3 ? "남성" : "여성");
		
		System.out.println("입력하신 주민번호는 " + result + "입니다.");
		
		
		
		
		
	}

}
