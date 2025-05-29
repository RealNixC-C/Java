package sec01.homework_string.homework02;

import java.util.ArrayList;

public class Run {

	public static void main(String[] args) {
		
		Practice practice = new Practice();
		
		String[] arrayList = new String[4];
//		ArrayList<String> list = new ArrayList<>(); 
		
		arrayList[0] = "서울특별시 금천구 디지털2로 95";
		arrayList[1] = "서울특별시 서대문구 연희로 248";
		arrayList[2] = "울산광역시 남구 돋질로 233";
		arrayList[3] = "경상북도 구미시 송정대로 55";
		
		for (int i = 0; i < arrayList.length; i++) {
			System.out.println(practice.takeState(arrayList[i]));
		}
		
		
//		String strr = "서울특별시 금천구 디지털2로 95";
//		String[] strArr = strr.split(" ");
//		
//		for(String str : strArr) {
//			System.out.println(str);
//		}
		
		
	}
	
}
