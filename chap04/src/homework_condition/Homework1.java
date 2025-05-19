package homework_condition;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = scanner.nextInt();
		
		String result;
		
		if (age >= 3 && age <= 12) {
			result = "10000원";
		} else if (age >= 13 && age <= 18) {
			result = "20000원";
		} else if (age >= 19 && age <= 64) {
			result = "30000원";
		} else {
			result = "무료";
		}
		
		System.out.println("나이 : " + age);
		System.out.println("당신의 놀이동산 요금은" + result + "입니다.");
		
		
	}

}
