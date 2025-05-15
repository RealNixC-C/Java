package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수는? ");
		double kr = scanner.nextDouble();
		
		System.out.print("영어 점수는? ");
		double eng = scanner.nextDouble();
		
		System.out.print("수학 점수는? ");
		double math = scanner.nextDouble();
		
		int total = (int) (kr + eng + math);
		int avg = total / 3 ;
		
		System.out.println("국어 : " + kr);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		
		
	}
}
