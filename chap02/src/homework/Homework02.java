package homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로길이를 입력하세요: ");
		double width = scanner.nextDouble();
		System.out.print("세로길이를 입력하세요: ");
		double height = scanner.nextDouble();
		
		double area = width * height;
		double circ = (width + height) * 2;
		
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("면적: " + area);
		System.out.println("둘레 : " + circ);
		
		
		
		
	}

}
