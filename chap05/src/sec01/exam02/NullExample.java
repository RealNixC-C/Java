package sec01.exam02;

public class NullExample {

	public static void main(String[] args) {

//		String hobby = null;
//		System.out.println(hobby.length()); // NPE 발생 (객체가 없으니 메소드 이용 불가)
		
		String hobby = "배드민턴";
		System.out.println(hobby.length());
		
		String name = "박요한";
		name = null; // 참조를 끊음
		
		// 이 때 "박요한" 이라는 객체는 쓰레기 객체가 됨
		// Java는 Garbage Collector가 CPU가 한가할 때나 메모리 부족할 때 자동으로 메모리에서 제거함
		
	}

}
