package sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {

		Student student = new Student("Yo Han", "930312-1622322", 7);
		// 생성자 호출 순서: student() -> People() -> Student() 
		// 즉, 부모 객체가 먼저 생성되고 자식 객체가 생성됨
		
		// Student()생성자 안에있는 super()가 먼저 실행되어 부모 생성자를 호출하고
		// 부모생성자 실행 완료후 돌아와 super()다음으로 실행 
		
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		System.out.println("studentNo: " + student.studentNo);
	}
	
		// 상속의 이점?
		// 1. 부모 클래스 재사용을 통해 빠른 개발가능
		// 2. 중복되는 코드를 줄임
		// 3. 부모만 수정하면 자식들까지 수정되는 효과가 있어 유지 보수 편리

}
