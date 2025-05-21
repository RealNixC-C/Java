package homework_object.homework02.controller;

import homework_object.homework02.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {

		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(5, 10);
		
		rec1.printInfo();
		rec2.printInfo();
		
		
		
	}

}
