package sec01.exam06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {

		byte[] buffer = new byte[5];
		
		// 입력 스트림으로부터 3바이트를 읽고 인덱스 2부터 순차적으로 저장
		
		try (InputStream is = new FileInputStream("C:/Temp/test3.db")) {
			int readByteNum = is.read(buffer, 2, 3);
			if (readByteNum != -1) { // 읽은 바이트가 있다면
				for (int i = 0; i < buffer.length; i++) {
					System.out.println(buffer[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
