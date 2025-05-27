package homework_exception.homework03;

import java.util.Scanner;

public class CharacterMenu {

	Scanner sc = new Scanner(System.in);
	
	CharacterController cc = new CharacterController();
	int howManyAlpha = 0;
	
	public void menu() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		try {
			howManyAlpha = cc.countAlpha(str);	
		} catch (CharCheckException e) {
			e.printStackTrace();
			return;
		}
		System.out.println(str + "에 포함된 영문자 개수 : " + howManyAlpha);
	}
	
}
