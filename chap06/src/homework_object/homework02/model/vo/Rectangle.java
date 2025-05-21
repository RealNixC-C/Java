package homework_object.homework02.model.vo;

public class Rectangle {

	private int width = 1;
	private int height = 1;
	
	public Rectangle() {};
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	};
	
	public int caculateRound() {
		
		int result = (width + height) * 2;
		return result;
	}
	public int calculateArea() {
		
		int result = (width * height);
		return result;
	}
	public void printInfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사각형의 둘레: ");
		System.out.println(caculateRound() + "cm");
		System.out.println("2. 사각형의 너비: ");
		System.out.println(calculateArea() + "cm");
	}
	
}
