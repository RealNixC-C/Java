package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		
//		System.out.println(myCar.speed); // 외부에서는 private 접근 불가
		
//		myCar.speed = -50; // 필드 접근제한이 public 일 경우 마음대로 조절 가능
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		// 멈춤
		if (!myCar.isStop()) { // 움직이는중(멈추지 않은상태)
			myCar.setStop(true);
		}
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		
	}
	
}
