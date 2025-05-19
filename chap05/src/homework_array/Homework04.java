package homework_array;

public class Homework04 {

	public static void main(String[] args) {

		int[] aRR = new int[6];
			
			for (int i = 0; i < aRR.length; i++) {
				int ranNum = (int) (Math.random() * 45) + 1;
				for (int j = 0; j <= i; j++) {
					if (ranNum == aRR[j]) {
						break;
					}
				}
				aRR[i] = ranNum;
		}
		for (int i = 0; i < aRR.length; i++) {
			System.out.print(aRR[i] + " ");
		}

	}

}
