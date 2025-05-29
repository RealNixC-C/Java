package homework_polymorphism.homework02.run;

import homework_polymorphism.homework02.model.vo.Dish;
import homework_polymorphism.homework02.model.vo.Drink;
import homework_polymorphism.homework02.model.vo.Menu;

public class Run {

	public static void main(String[] args) {

		Menu[] menu = new Menu[5];
		
		for (int i = 0; i < menu.length; i++) {
			int	ranNum = (int)(Math.random() * 2);
			if(ranNum == 0) {
				menu[i] = new Dish("새우볶음밥", 8000, "새우"); 
			} else {
				menu[i] = new Drink("오렌지쥬스", 6000, "오렌지");
			}
		}
		
		for(Menu onMenu : menu) {
			onMenu.cook();
		}
	}
	

}
