package homework_intheritance.homework02.view;

import java.util.Scanner;

import homework_intheritance.homework02.controller.ChocolateController;
import homework_intheritance.homework02.controller.GreenTeaController;

public class CakeMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private ChocolateController cc = new ChocolateController();
	private GreenTeaController gtc = new GreenTeaController();
	
	public void mainMenu() { 
		while(true) {
			System.out.println("===== 어떤 케이크를 만드시겠습니까? =====");
			System.out.println("1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개");
			System.out.println("2. 녹차케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개");
			System.out.println("9. 취소");
			System.out.print("메뉴 번호 : ");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				chocolateMenu();
				break;
			case 2:
				greenTeaMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다.");
				break;
				}
		}
	}
	public void chocolateMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("체리(g) : ");
		int cherry = sc.nextInt();
		System.out.print("초콜릿 칩(g) : ");
		int chip = sc.nextInt();
		
		System.out.println(cc.bakeChocolateCake(flour, cream, cherry, chip));
		System.out.println("초콜릿 케이크가 완성 되었습니다.");
	}
	public void greenTeaMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("녹차 파우더(g) : ");
		double powder = sc.nextInt();
		System.out.print("치즈 큐브(개) : ");
		int cheese = sc.nextInt();
		
		System.out.println(gtc.bakeGreenTeaCake(flour, cream, powder, cheese));
		System.out.println("치즈 케이크가 완성 되었습니다.");
	}
}
