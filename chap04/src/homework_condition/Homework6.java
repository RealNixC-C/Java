package homework_condition;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("각 과목의 점수를 입려하세요.");
		
		System.out.print("소프트웨어설계 점수: ");
		int sub1 = scanner.nextInt();
		
		System.out.print("소프트웨어개발 점수: ");
		int sub2 = scanner.nextInt();
		
		System.out.print("데이터베이스구축 점수: ");
		int sub3 = scanner.nextInt();
		
		System.out.print("프로그래밍언어활용 점수: ");
		int sub4 = scanner.nextInt();
		
		System.out.print("정보시스템구추관리 점수: ");
		int sub5 = scanner.nextInt();
		
		double avg = (sub1 + sub2 + sub3 + sub4 + sub5) / 5.0;
		
		if (sub1 < 40) {
			System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
		} else if (sub2 < 40) {
			System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
		} else if (sub3 < 40) {
			System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
		} else if (sub4 < 40) {
			System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
		} else if (sub5 < 40) {
			System.out.println("정보시스템구추관리 과목 과락으로 불합격입니다.");
		} else if (avg < 60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
		} else {
			System.out.println("합격을 축하합니다.");
		}
		
		
		
		
		
		
		
	}
}
