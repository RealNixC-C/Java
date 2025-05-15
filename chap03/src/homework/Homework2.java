package homework;

import java.util.Scanner;

public class Homework2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int NumOfBead = scanner.nextInt();
		
		String result = NumOfBead % 2 == 0 ? "구슬의 개수는 짝수입니다." : (NumOfBead % 2 == 1 ? "구슬의 개수는 홀수입니다." : "잘못된 숫자입니다");
		System.out.println(result);
	}
}
