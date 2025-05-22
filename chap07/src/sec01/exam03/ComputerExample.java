package sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {

		Calculator calculator = new Calculator(); 
		int r = 10;
		
		System.out.println("원면적: " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적: " + computer.areaCircle(r));
	}

}
