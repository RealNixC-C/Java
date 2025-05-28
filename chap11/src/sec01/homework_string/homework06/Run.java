package sec01.homework_string.homework06;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String sentence = "the quick brown fox jumps over the lazy dog";

		System.out.print("단어를 입력하세요: ");
		String inputWord = sc.nextLine();

		String[] wordsArray = sentence.split(" ");

		if (inputWord.equals(wordsArray[wordsArray.length - 1])) {
			System.out.println("마지막 단어입니다.");
			return;
		}
		
		for (int i = 0; i < wordsArray.length; i++) {
			if (inputWord.equals(wordsArray[i])) {
				System.out.println(wordsArray[i] + " 다음 단어: " + wordsArray[i + 1]);
				return;
			} 
		}
		System.out.println("존재하지 않는 단어입니다.");

	}

}
