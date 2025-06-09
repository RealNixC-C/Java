package sec03.exam03.quiz;

import java.io.File;
import java.io.IOException;

public class Quiz2 {
	// Quiz
//	먼저 "C:\test\sub" 폴더 아래에 test1.txt, test2.txt, test3.txt 파일을 만들어주세요.
	
//	FileManager 클래스에 deleteFile(dir: File): void 메소드를 정의합니다.
//	실행 클래스에서 FileManager 클래스를 객체화한 다음 deleteFile() 메소드를 호출하세요.
//	deleteFile()은 "C:\test\sub" 아래에 있는 파일들을 모두 삭제하는 기능을 수행합니다.
	
//	[출력]
//	C:\test\sub\2025 -> 삭제 안됨
//	C:\test\sub\test1.txt -> 삭제 완료
//	C:\test\sub\test2.txt -> 삭제 완료
//	C:\test\sub\test3.txt -> 삭제 완료
	
	public static void main(String[] args) throws Exception {
		
		// 지문에 폴더 아래에 txt파일을 생성하세요는 직접 디렉토리에 들어가서 만들라는뜻
		// File의 메소드인 listfiles를 활용하여 현재 디렉토리내에 있는 모든 파일과
		// 폴더들을 File[]로 객체화켜 저장 후 delete()메소드로 삭제하는 방법
		// 폴더내에 다른 하위폴더가 있으면 삭제되지않음
		
		FileManager fileManager = new FileManager();
		File file1 = new File("C:/test/sub/test1.txt"); 
		File file2 = new File("C:/test/sub/test2.txt"); 
		File file3 = new File("C:/test/sub/test3.txt");  
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();
		
		File dir = new File("C:/test/sub");
		fileManager.deleteFile(dir);
		
	}

}
