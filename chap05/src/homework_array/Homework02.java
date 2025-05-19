package homework_array;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int arrlength = scanner.nextInt();
		
		int[] arr = new int[arrlength];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			int num = scanner.nextInt();
			arr[i] = num;
			sum += num;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
		
	}

}
