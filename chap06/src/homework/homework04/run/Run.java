package homework.homework04.run;

import homework.homework04.controller.ExMethodController;

public class Run {
	
	public static void main(String[] args) {
		
		ExMethodController exControl = new ExMethodController();
		
		exControl.outPutMessage("전달해주세요.");
		
		System.out.println(exControl.sum1TO100());
		
		System.out.println(exControl.evenOrOdd(2));
		System.out.println(exControl.evenOrOdd(3));
		
		System.out.println(exControl.isAlphabetIn("나는 알파벳 A포함"));
		System.out.println(exControl.isAlphabetIn("나는 알파벳 미포함"));
		
		exControl.howManyAlphabet("application", 'p');
		
		exControl.timeTable(5);
		
	}
	
}
