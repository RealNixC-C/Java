package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		int friendNum = (int) (Math.random() * 50) + 1;		
//		int candyNum = (int) (Math.random() * 100) + 1;
		System.out.print("친구 수: ");
		int friendNum = scanner.nextInt();		
		System.out.print("사탕 수: ");
		int candyNum = scanner.nextInt();		
		
		int candyPerPerson = candyNum / friendNum;
		int candyLeft = candyNum % friendNum;

		System.out.println("친구 수 : " + friendNum);
		System.out.println("사탕의 수 : " + candyNum);
		System.out.println("1인당 사탕 개수 : " + candyPerPerson + "개");
		System.out.println("남은 사탕 개수 : " + candyLeft + "개");
	}

}
