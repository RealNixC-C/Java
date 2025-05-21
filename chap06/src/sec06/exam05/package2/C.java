package sec06.exam05.package2;

import sec06.exam05.package1.A;

public class C {

	A a = new A();
	
	public C() {
		a.field1 = 1;
//		a.field2 = 2; // error
//		a.field3 = 1; // error
		
		a.method1();
//		a.method2();
//		a.method3(); // error
	}
	
	public void method() {
		a.field1 = 1;
//		a.field2 = 2; // error
//		a.field3 = 1; // error
		
		a.method1();
//		a.method2(); // error
//		a.method3(); // error
	}
	
}
	

