package homework_object.homework01.controller;

import homework_object.homework01.model.vo.Member;

public class Run {

	public static void main(String[] args) {

		Member member = new Member();
		
		member.changeName("Yo Han Park");
		member.printName();
		
	}

}
