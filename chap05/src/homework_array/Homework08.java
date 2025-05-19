package homework_array;

import java.util.Arrays;

public class Homework08 {

	public static void main(String[] args) {
		
		String[] menu = {"Burger", "Pizza", "Pasta"};
		String[] add = {"Salad","Soup"};
		
		String[] todayMenu = Arrays.copyOf(menu, menu.length + 2);
		
		for (int i = 3; i < todayMenu.length; i++) {
			todayMenu[i] = add[i - 3];
		}
		
		System.out.print("어제 메뉴판 : ");
		for (int i = 0; i < menu.length; i++) {
			if (i == menu.length - 1) {
				System.out.println(menu[i]);
			} else {
				System.out.print(menu[i] + ", ");
			}
		}
		System.out.print("오늘 메뉴판 : ");
		for (int i = 0; i < todayMenu.length; i++) {
			if (i == todayMenu.length - 1) {
				System.out.println(todayMenu[i]);
			} else {
				System.out.print(todayMenu[i] + ", ");
			}
		}
		
	}

}
