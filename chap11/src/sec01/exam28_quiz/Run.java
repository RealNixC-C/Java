package sec01.exam28_quiz;

import java.util.Scanner;

public class Run {

//  Quiz
//	반 전체 학생이 몇 명인지 입력을 받아 배열을 만들고,
//	우리반 학생들 이름을 입력받아서 모두의 이름을 배열에 추가합니다.
//	전체 학생 중에서 오늘 커피 쏠 사람을 랜덤으로 뽑으려고 해요.
//	Math.random()을 활용해서 학생 한 명을 추출하여 출력하세요.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수? ");
		int studentNum = sc.nextInt();
		sc.nextLine();
		String[] name = new String[studentNum];

//		int congrat = 0;

		for (int i = 0; i < name.length; i++) {
			System.out.print((i + 1) + "번째 학생이름 : ");
			name[i] = sc.nextLine();
//			if(num == i) {
//				congrat = i;
//			}
		}
		int num = (int) (Math.random() * name.length);
		
		System.out.println("커피 쏠 학생: " + name[num]);
	}

}
