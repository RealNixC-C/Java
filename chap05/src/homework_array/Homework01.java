package homework_array;

import java.util.Arrays;
import java.util.Iterator;

public class Homework01 {

	public static void main(String[] args) {

		int[] arr = { 152, 180, 165, 158, 171 };
		int save;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					save = arr[j]; 
					arr[j] = arr[j + 1];
					arr[j + 1] = save; 
				}
			}
		}
		
//		for (int i = 0; i <= arr.length - 2; i++) {
//		for (int j = i + 1; j <= arr.length -1 ; j++) {
//			if (arr[i] > arr[j]) {
//				save = arr[i];
//				arr[i] = arr[j];
//				arr[j] = save;
//			}
//		}
//	}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		
	}
}
