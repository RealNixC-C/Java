package homework_exception.homework04;

public class NumberController {

	public NumberController() {
		
	}
	
	public boolean checkDouble(int num1, int num2) throws NumberRangeException {
		if(!(num1 > 0 && num1 <= 100) || !(num2 > 0 && num2 <= 100)) {
//		if((num1 < 0 || num1 > 100) || (num2 < 0 || num2 > 100)) {
			throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
		} 
		if(num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
