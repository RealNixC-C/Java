package homework;

import java.util.Scanner;

public class Homework01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몸무게(kg)를 입력하세요: ");
		double weight = scanner.nextDouble();
		System.out.print("키(m)를 입력하세요: ");
		double height = scanner.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("몸무게(kg) : " + weight);
		System.out.println("키(m) : " + height);
		System.out.printf("BMI 지수 : %.1f", bmi);
		
		
		
	
		
		
		
	}
}
