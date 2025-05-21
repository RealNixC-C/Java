package homework_object.homework05.controller;

import homework_object.homework05.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.setName("김철수");
		student1.setClassRoom('A');
		student2.setName("홍길동");
		student2.setClassRoom('F');
		student3.setName("이영희");
		student3.setClassRoom('B');
		
		System.out.println(student1.getstudentNum() + " " + student1.getName() + " " + student1.getClassRoom());
		System.out.println(student2.getstudentNum() + " " + student2.getName() + " " + student2.getClassRoom());
		System.out.println(student3.getstudentNum() + " " + student3.getName() + " " + student3.getClassRoom());
		
		
	}

}
