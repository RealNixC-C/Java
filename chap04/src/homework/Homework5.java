package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 1~5를 입력해주세요: ");
		int number = scanner.nextInt();
		
	
		if (number == 1) {
			System.out.println("스쿼트 운동 시간입니다.");
		} else if(number == 2) {
			System.out.println("데드리프트 운동 시간입니다.");
		} else if(number == 3) {
			System.out.println("벤치 프레스 운동 시간입니다.");
		} else if(number == 4) {
			System.out.println("풀업 운동 시간입니다.");
		} else if(number == 5) {
			System.out.println("오늘도 수고하셨습니다.");
		} else if(number < 0 || number > 5) {
			System.out.println("목록에 있는 숫자만 입력해주세요.");
		} 
		
		
		
		
	}
}
