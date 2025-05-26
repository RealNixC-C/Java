package homework_polymorphism.homework02.run;

import homework_polymorphism.homework02.model.vo.Dish;
import homework_polymorphism.homework02.model.vo.Drink;
import homework_polymorphism.homework02.model.vo.Menu;

public class Run {

	public static void main(String[] args) {

		Menu[] menu = new Menu[5];
		
		menu[0] = new Dish("새우볶음밥", 8000, "새우");
		menu[1] = new Drink("오렌지쥬스", 6000, "오렌지");
		menu[2] = new Dish("라면", 4000, "면");
		menu[3] = new Drink("메론소다", 3000, "메론");
		menu[4] = new Dish("스테이크", 8000, "한우");
		
		for(Menu onMenu : menu) {
			onMenu.cook();
		}
	}
	

}
