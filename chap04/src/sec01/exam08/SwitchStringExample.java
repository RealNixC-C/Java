package sec01.exam08;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "과장";
		
		// Java 7 부터 정수 타입 외에 문자열도 허용
		switch (position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("500만원");
				break;
			default:
				System.out.println("300만원");		
				break;
		}
	}

}
