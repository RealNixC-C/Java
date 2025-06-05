package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {

		// Quiz: 데이터 도착지를 test2.db 파일로 하는 바이트 기반 파일 출력 스트림을 생성
		byte[] bytes = {10, 20, 30};
		
//		try (OutputStream os = new FileOutputStream("C:/Temp/Test2.db")) {
//			os.write(bytes);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		OutputStream os = new FileOutputStream("C:/Temp/Test2.db");
		
		os.write(bytes);
		os.flush();
		os.close();
		

	}

}
