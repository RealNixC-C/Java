package sec01.homework_string.homework03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine().trim();
		
		String[] check = email.split("@");
		if(check[1].equals("goodee.co.kr")) {
			System.out.println("아이디 : " + check[0].toUpperCase());
		} else {
			System.out.println("유요하지 않은 이메일입니다.");
		}
	}
	
}
