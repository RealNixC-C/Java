package homework_intheritance.homework02.controller;

import homework_intheritance.homework02.model.vo.Chocolate;

public class ChocolateController {

	private Chocolate c = new Chocolate();
	
	public String bakeChocolateCake(double flour, double cream, int cherry, int chip) {
		c = new Chocolate(flour, cream, cherry, chip);
		return c.toString();
	}
	
}
