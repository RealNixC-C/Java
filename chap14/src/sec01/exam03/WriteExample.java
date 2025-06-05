package sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp/Test3.db");
		
		// 출력할 바이트 배열
		byte[] bytes = {10, 20, 30, 40, 50};
		
		// 주어진 배열의 off 부터 len개 까지의 바이트를 출력
		// 1번 인덱스부터 3개를 출력
		os.write(bytes, 1, 3);
		
		os.flush();
		os.close();
		
	}

}
