package homework_intheritance.homework02.controller;

import homework_intheritance.homework02.model.vo.GreenTea;

public class GreenTeaController {

	private GreenTea gt = new GreenTea();
	
	public String bakeGreenTeaCake(double flour, double cream, double powder, int cheese) {
		gt = new GreenTea(flour, cream, powder, cheese);
		return gt.toString();
	}
	
}
