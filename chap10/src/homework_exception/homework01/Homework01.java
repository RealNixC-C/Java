package homework_exception.homework01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	int ranNum = (int) (Math.random() * 50) + 1;
	int count = 0;
	int user = 0;

	while (true) {
		System.out.print("1~50사이의 숫자 : ");
		try {
			user = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
			sc.nextLine();
			continue;
		}
		
		count++;
		if (user < ranNum) {
			System.out.println("Up!");
		} else if(user > ranNum) {
			System.out.println("Down!");
		} else if(user == ranNum) {
			System.out.println("축하합니다~ 정답이에요");
			break;
		} 

	}
	System.out.println("총 시도 횟수: " + count + "번");
	
	}
	
}
