package homework.homework01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Practice {
	
	public void method1(String str) { 
		try (FileOutputStream fos = new FileOutputStream("C:/test/sub/나비야1.dat")) {
			long start = System.nanoTime();
			Writer writer = new OutputStreamWriter(fos);
			writer.write(str);
			writer.flush();
			long end = System.nanoTime();
			System.out.println("총 걸린 시간: " + (end - start) + "ns");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void method2(String str) { 
		try (FileOutputStream os = new FileOutputStream("C:/Test/sub/나비야2.dat")) {
			BufferedOutputStream bos = new BufferedOutputStream(os);
			long start = System.nanoTime();
			Writer writer = new OutputStreamWriter(bos);
			writer.write(str);
			writer.flush();
			long end = System.nanoTime();
			System.out.println("총 걸린 시간: " + (end - start) + "ns");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
