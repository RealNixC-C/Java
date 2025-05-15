package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("말해보세요: ");
		String comeAndGo = scanner.nextLine();
		
		boolean result = comeAndGo.equals("간다");
		
//		System.out.println(!result ? "간다" : "온다");
		
		
		System.out.println("앵무새 : " + ("간다".equals(comeAndGo) ? "온다" : "간다"));
		// 위와 같이 코드 작성시 "간다"값에는 null이 아니기때문에 오류가 발생하지 않으므로 좋은코드
		
		
		
		
		
	}

}
