package homework_array;

import java.util.Arrays;

public class Homework04 {

	public static void main(String[] args) {

		int[] aRR = new int[6];
		int count = 0;
		int i;

		while (count < aRR.length) {

			int ranNum = (int) (Math.random() * 45) + 1;

			for (i = 0; i < count; i++) {
				if (aRR[i] == ranNum) break;
			}

			if (i == count) {
				aRR[count] = ranNum;
				count++;
			}
		}
		Arrays.sort(aRR);
		for (i = 0; i < aRR.length; i++) {
			System.out.print(aRR[i] + " ");
		}

	}

}
