package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = scanner.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = scanner.nextInt();
		System.out.print("세 번째 숫자 : ");
		int num3 = scanner.nextInt();
		
		int minNum = num1;
		minNum = num2 < minNum ? (num3 < minNum ? num3 : num2 ) : (num2 < minNum ? num2 : num1);
		
		System.out.println("세 수 중에서 가장 작은 수는" + minNum + "입니다.");
		
	}

}
