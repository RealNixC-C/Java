package homework_exception.homework04;

import java.util.Scanner;

public class NumberMenu {

	Scanner sc = new Scanner(System.in);
	
	NumberController numController = new NumberController();
	
	public void menu() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		boolean forCheck = false;
		
		try {
			forCheck = numController.checkDouble(num1, num2);
		} catch (NumberRangeException e) {
			e.printStackTrace();
			return;
		}
		
		System.out.println(num1 + "은(는) " + num2 + "의 배수인가? " + forCheck);
	}
	
}
