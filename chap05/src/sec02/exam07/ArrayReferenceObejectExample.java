package sec02.exam07;

public class ArrayReferenceObejectExample {

	public static void main(String[] args) {

		String[] strArray = new String[3];
		
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]); // 참조값 비교
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2])); // 내부 문자열 비교
		
		
	}

}
