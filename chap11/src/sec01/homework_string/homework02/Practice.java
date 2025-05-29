package sec01.homework_string.homework02;

public class Practice {

	//"서울특별시 금천구 디지털2로 95"
	public String takeState(String str) {
		
		String[] strArr = str.split(" ");
		
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].endsWith("구")) {
				return strArr[i];
			}
		}
		
		return null;
	}
	
	
}
