package homework;

import java.util.Scanner;

public class Homework4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수는?");
		int kor = scanner.nextInt();
		
		System.out.print("수학 점수는?");
		int math = scanner.nextInt();
		
		System.out.print("영어 점수는?");		
		int eng = scanner.nextInt();
		
		int total = kor + math + eng;
		int avg = (kor + math + eng) / 3;
		
		String result = kor >= 60 && math >= 60 && eng >= 60 && avg >= 90 ? "휴대폰을 바꿀 수 있습니다.": "휴대폰을 바꿀 수 없습니다.";
		
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("합계 : " + total + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.println(result);
		
		
		
		
	}
}
