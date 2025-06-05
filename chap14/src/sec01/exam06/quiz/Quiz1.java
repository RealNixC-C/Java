package sec01.exam06.quiz;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Quiz1 {
	// Quiz
//	FileInputStream을 사용하여 
//	애국가1.dat 파일을 읽어와서 콘솔에 표준 출력하세요.
		
//	[출력]
//	동해물과 백두산이 마르고 닳도록 하느님이 보우하사
//	우리나라 만세 무궁화 삼천리 화려강산
//	대한사람 대한으로 길이 보전하세
//	남산위에 저 소나무 철갑을 두른듯
//	바람서리 불변함은 우리기상 일세
//	무궁화 삼천리 화려강산 
//	대한사람 대한으로 길이보전하세
		
//	힌트: FileInputStream은 바이트 기반 스트림이므로 
//	바이트 배열 단위로 읽어와서 저장하고 이를 문자열로 변환
	
	public static void main(String[] args) {
		
//		byte[] byteArr = new byte[1000]; 
//		
//		try (InputStream is = new FileInputStream("C:/Temp/애국가1.dat")) {
//			
//			while (true) {
//			int readByteNum = is.read(byteArr);
//			if(readByteNum == -1);
//			break;
//			}
//			String str = new String(byteArr);
//			System.out.println(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		byte[] byteArr = new byte[1000]; 
		
		try (InputStream is = new FileInputStream("C:/Temp/애국가1.dat")) {
			
			int readByteNum;
			while ((readByteNum = is.read(byteArr)) != -1) {
				// 0번인덱스부터 읽어온 길이만큼 "UTF-8"로 변환하고 문자열로 변환
				String str = new String(byteArr, 0, readByteNum, "UTF-8");
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 이렇게 바이트를 직접 읽고 수동을 디코딩(비추천)
		// 가능은 하지만 인코딩 경계 문제(멀티바이트 문자 잘림 등)가 있어서 복잡하고 오류 위험이 큼
		// 한글은 3바이트로 구성이 돼있기때문에 10byte 단위로 읽어오게되면 깨지게 되어있음
		// => 문자 기반 스트림 사용
		
	}

}
