package homework_object.homework04.open.controller;

import homework_object.homework04.open.model.vo.Person;

public class Run {

	public static void main(String[] args) {

		Person person = new Person();
		
		person.name = "김철수";
		person.age = 20;
		
		System.out.println(person.name + "는 " + person.age + "살 입니다.");
		

	}

}
