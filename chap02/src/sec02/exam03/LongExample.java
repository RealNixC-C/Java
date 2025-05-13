package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L; // L을 붙이거나 안붙이가
//		long var3 = 2000000000; // 자바 컴파일러는 정수 리터럴을 기본적으로 int 타입으로 간주
		// 200억 int 타입의 번호 범위를 넘기때문에 컴파일 에러 살행;
		// 컴파일러에게 int 타입이 아니라 long 타입의 숫자만 알려줘
		long var4 = 2000000000L; // L또는 l이라 붙임
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}

}
