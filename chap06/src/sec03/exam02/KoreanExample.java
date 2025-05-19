package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {

		// 생성자를 통해 객체의 필드값을 초기화
		
		Korean k1 = new Korean("박닉스", "963012-1263321");
		System.out.println("k1.nation: " + k1.nation);
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		
		System.out.println();
		
		Korean k2 = new Korean("박엔드", "863012-1008561");
		System.out.println("k2.nation: " + k2.nation);
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn);
	}

}
