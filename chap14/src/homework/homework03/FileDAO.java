package homework.homework03;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileDAO {

	public boolean checkName(String file) {
		File checkFile = new File("C:/test/homework1");
		File[] fileList = checkFile.listFiles();
		for (File files : fileList) {
			if(file.equals(files.getName())) {
				return true;
			}
		}
		return false;
	}
	
	public void fileSave(String file, String s) {
		
		try {
			File newFile = new File("C:/test/homework1/" + file);
			Writer writer = new FileWriter(newFile);
			newFile.createNewFile();
			writer.write(s);
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		
		StringBuilder strBuilder = new StringBuilder();
		char[] charArr = new char[100];
		int readCharNum = 0;
		
		try (Reader reader = new FileReader("C:/test/homework1/" + file)) {
			while ((readCharNum = reader.read(charArr)) != -1) {
				String str = new String(charArr, 0, readCharNum);
				strBuilder.append(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return strBuilder;
	}
	
	public void fileEdit(String file, String s) {
		
	}
	
}
