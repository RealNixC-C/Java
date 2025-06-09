package homework.homework02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Practice {

	public void method1(String str) {
		try (FileInputStream fis = new FileInputStream(str)) {
			long start = System.nanoTime();
			byte[] byteArr = new byte[200];
			int readByteNum = 0;
			while ((readByteNum = fis.read(byteArr)) != -1) {
				String btf = new String(byteArr, 0, readByteNum);
				System.out.println(btf);
			}
			long end = System.nanoTime();
			System.out.println("총 걸린 시간: " + (end - start) + "ns");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void method2(String str) {
		try {
			FileInputStream fis = new FileInputStream(str);
			BufferedInputStream bis = new BufferedInputStream(fis);
			long start = System.nanoTime();
			byte[] byteArr = new byte[200];
			int readByteNum = 0;
			while ((readByteNum = bis.read(byteArr)) != -1) {
				String btf = new String(byteArr, 0, readByteNum);
				System.out.println(btf);
			}
			long end = System.nanoTime();
			System.out.println("총 걸린 시간: " + (end - start) + "ns");
		} catch (Exception e) {
			
		}
		
		
	}
	
}
