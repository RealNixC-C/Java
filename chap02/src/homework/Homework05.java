package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수는? ");
		double mlang = scanner.nextDouble();
		int intMlang = (int) mlang; 
		System.out.print("영어 점수는? ");
		double eng = scanner.nextDouble();
		int intEng = (int) eng; 
		System.out.print("수학 점수는? ");
		double math = scanner.nextDouble();
		int intMath = (int) math; 
		
		int total = (int) (mlang + eng + math);
		System.out.println(total);
		int avg = (int)(mlang + eng + math) / 3 ;
		
		System.out.println("국어 : " + intMlang);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		
		
	}
}
