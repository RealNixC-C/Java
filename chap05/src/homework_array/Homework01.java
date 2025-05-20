package homework_array;

import java.util.Arrays;

public class Homework01 {

	public static void main(String[] args) {

		int[] arr = { 152, 180, 165, 158, 171 };
		int save;
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0 + 1; j < arr.length -1 ; j++) {
				if (arr[j] > arr[j + 1]) {
					save = arr[j];
					arr[i] = arr[j + 1];
					arr[j + 1] = save;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
}
