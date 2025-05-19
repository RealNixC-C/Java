package sec03.exam01;

public class CarExample {

	public static void main(String[] args) {

		// Car클래스에 명시적으로 생성자를 만들었기 
		//때문에 인자값이 없는 Car()호출이 동작되지않음
//		Car car = new Car(); // he constructor Car() is undefined
		// 컴파일 에러, 기본 생성자가 선언되지않음
		
		// 우리가 선언한 생성자에 맞게끔 매개값 제공
		Car car = new Car("검정", 3000);
		
	}

}
