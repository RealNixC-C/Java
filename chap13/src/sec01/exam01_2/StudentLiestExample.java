package sec01.exam01_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentLiestExample {

	public static void main(String[] args) {

		// 타입 파라미터로 사용자 정의 객체를 사용할 경우
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("박요한", 33));
		studentList.add(new Student("이수진", 27));
		studentList.add(new Student("박민수", 40));
		
		// 객체 검색
		// 사용자 정의 객체를 사용할 경우 indexOf(), contains()가
		// 해당 객체 존재 여부를 판단하는 기준은 equals() // 두 함수가 내부에서 equals사용
		// 두 객체간의 참조값이 달라도 필드값이 같으면 같은 객체로 판단하기 위해 
		// equals() 메소드를 재정의
		
		
		if (studentList.indexOf(new Student("박요한", 33)) != -1) {
			System.out.println("indexOf: 있다.");
		} else {
			System.out.println("indexOf: 없다.");
		}

		if (studentList.contains(new Student("박요한", 33))) {
			System.out.println("indexOf: 있다.");
		} else {
			System.out.println("indexOf: 없다.");
		}
		
		// 객체 정렬
		// Integer, String과 같은 경우 Collections.sort() 바로 사용 가능
		// Student처럼 사용자 정의 객체끼리 비교할 경우 비교 불가능
		// 정렬 기준으로 어떤 값을 사용할지 별도로 구현해야 함
		// 예: name을 기준으로 정렬할 것인가, age를 기준으로 정렬할 것인가
		
		// 2가지 방법
		// Student 클래스가 Comparable 인터페이스를 구현하거나
		// 자바의 Comparator를 사용해서 정렬 조건을 지정
		
		// 기본 정렬(age 오름차순)
		
		Collections.sort(studentList); // 재정의한 compareTo() 기준을 정렬
		System.out.println("나이 기준 기본 정렬");
		for (Student s : studentList) {
			System.out.println(s.getName() + " - " + s.getAge());
		}
		
		
	};
	
	

	

}
