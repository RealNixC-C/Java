package homework.homework03;

public class Parts {

	String concat(String str1, String str2) {
		return str1 + str2;
	}
	
	int multiple(int num1, int num2) {
		if (num1 < num2) {
			System.out.print("계산할 수 없습니다 ");
			return 0;
		}
		return num1 * num2;
	}
	
	boolean isSame (String str1, String str2) {
		if (str1.equals(str2)) {
			return true;
		} 
		return false;
		
	}
}
