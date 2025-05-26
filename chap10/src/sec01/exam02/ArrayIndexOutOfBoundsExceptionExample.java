package sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {

		int[] arr = {1 ,2 ,3};
//		int result = arr[0] + arr[3]; // 예외 발생 인덱스값 벗어남
		int result = arr[0] + arr[2];
		
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("arg[0]: " + data1);
		System.out.println("arg[1]: " + data2);
		
		
	}

}
