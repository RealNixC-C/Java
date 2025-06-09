package sec03.exam03.quiz;

import java.io.File;

public class FileManager {

	public void deleteFile(File dir) {
//		if (dir.exists() && dir.isDirectory()) {} // 존재여부와 파일유형 우선확인
		if (!dir.exists()) return;
		
		File[] files = dir.listFiles();
		
		for (File file : files) {
			if (file.delete()) {
				System.out.println(file + " -> 삭제 완료");
			} else {
				System.out.println(file + " -> 삭제 안됨");
			}
		}
	}
}
