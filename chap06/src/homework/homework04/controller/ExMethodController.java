package homework.homework04.controller;

public class ExMethodController {

	public void outPutMessage(String message) {
		System.out.println(message);
	}

	public int sum1TO100() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	public String evenOrOdd(int num) {
		if (num % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}

	public boolean isAlphabetIn(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ||
				str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				return true;
			}
		}
		return false;
	}

	public void howManyAlphabet(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(ch + "문자 " + count + "개 포함");
	}

	public void timeTable(int num) {
		for (int i = num; i == num; i++) {
			System.out.println("****" + i + "단****");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
		}

	}

}
