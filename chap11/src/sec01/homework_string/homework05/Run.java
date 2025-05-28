package sec01.homework_string.homework05;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		
		String pw = "";
		
		pw += name.charAt(0);
		pw += birth.substring(2, 4);
		pw += birth.substring(6);
		pw += name.substring(1);
		
		System.out.println(pw);
		
		
		
	}

}
