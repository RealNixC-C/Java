package homework_array;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("정수 : ");
			int numOdd = scanner.nextInt();

			
			if (numOdd < 3 || numOdd % 2 == 0) {
				System.out.println("다시 입력하세요");
				continue;
			}
			
			int count = 1;
			
			int[] numArr = new int[numOdd];
			
			for (int i = 0; i < numOdd; i++) {
				if (i > numOdd / 2) { // *******************
					numArr[i] = numArr[i - 1] - 1; 
				} else {
					numArr[i] = i + 1;

				}
				System.out.print(numArr[i] + " ");
			} 
			
		}
	}
}
