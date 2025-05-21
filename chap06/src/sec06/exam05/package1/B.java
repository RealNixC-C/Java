package sec06.exam05.package1;

public class B {

	A a = new A();
	
	public B() {
		a.field1 = 1;
		a.field2 = 2;
//		a.field3 = 1; // error
		
		a.method1();
		a.method2();
//		a.method3(); // error
	}
	
	public void method() {
		a.field1 = 1;
		a.field2 = 2;
//		a.field3 = 1; // error
		
		a.method1();
		a.method2();
//		a.method3(); // error
	}
	
}
