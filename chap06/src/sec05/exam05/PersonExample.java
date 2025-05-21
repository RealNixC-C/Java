package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("125222-267723", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa"; // 컴파일 에러 final cannot be assigned
//		p1.ssn = "621342-392922"; // 컴파일 에러 final cannot be assigned
		p1.name = "홍삼원";
		System.out.println(p1.name);
	}

}
