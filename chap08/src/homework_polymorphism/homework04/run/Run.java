package homework_polymorphism.homework04.run;

import homework_polymorphism.homework04.model.vo.GalaxyS24;
import homework_polymorphism.homework04.model.vo.Iphone15;
import homework_polymorphism.homework04.model.vo.SmartPhone;

public class Run {

	public static void main(String[] args) {

		SmartPhone[] smartphone = new SmartPhone[2];
		
		smartphone[0] = new GalaxyS24();
		smartphone[1] = new Iphone15();
		
		for(SmartPhone func : smartphone) {
			func.printMaker();
			func.makeCall();
			func.takeCall();
			func.touch();
			func.charge();
			func.picture();
			System.out.println("--------------------------");
		}
		
		
	}

}
