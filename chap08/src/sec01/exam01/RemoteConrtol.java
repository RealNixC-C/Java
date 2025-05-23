package sec01.exam01;


// 인터페이스
// 상수 + 추상 메소드의 집함 (본질)- 추후 자바 버전이 올라가면서 디폴드 메소드, 정적(static) 메소드도 추가됨
// 추상 클래스보다 더 추상화 된 껍데기(=뼈대만 있는 설계 구격)
// 구현된 것이 전혀 없는 설계 규격, 모든 멤버가 pubic 접근 제한
// 객체의 사용 방법을 정의한 사용 설명서

public interface RemoteConrtol {
	
	// 인터페이스
	// 상수 + 추상 메소드의 집함 (본질)- 추후 자바 버전이 올라가면서 디폴드 메소드, 정적(static) 메소드도 추가됨
	// 추상 클래스보다 더 추상화 된 껍데기(=뼈대만 있는 설계 구격)
	// 구현된 것이 전혀 없는 설계 규격, 모든 멤버가 pubic 접근 제한
	// 객체의 사용 방법을 정의한 사용 설명서

	// can be 관계
	// ~ 할 수 있다.
	// Airplane can be Flyable
	// Fighter can be Flighable.
	// TV can be RemoteControl
//		Audio can be RemoteControl.
	// public static final이 자동으로 추가됨
	
}
