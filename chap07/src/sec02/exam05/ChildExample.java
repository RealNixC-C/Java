package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {

		Parent parent = new Child(); // 자동 타입 변환
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// Prarent 타입에는 없으므로 쓸 수 없다.
//		parent.field2 = "date2";
//		parent.method3();
		
		Child child = (Child) parent;
		
		child.field2 = "yyy";
		child.method3();
	}

}
