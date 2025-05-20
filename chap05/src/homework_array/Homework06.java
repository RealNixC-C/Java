package homework_array;

import java.util.Arrays;
import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int count = 1;
		int inArray = 0;
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int arrange = scanner.nextInt();

		scanner.nextLine();
		// 이 줄에서 숫자만 읽고 줄 바꿈 문자 (\n)는 소비하지 않기 때문에,
		// 그 다음 scanner.nextLine()이 실행되면 아무 입력도 없이 줄 바꿈만 읽어버림
		
		String[] aRR = new String[arrange];
		
		for (int i = 0; i < aRR.length; i++) {
			System.out.print(count + "번째 문자열 : ");
			String userStr = scanner.nextLine();
			aRR[i] = userStr;
			count ++;
			inArray ++;
		}
		
		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String confirm = scanner.nextLine();
			
			if (confirm.equalsIgnoreCase("y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int moreArrange = scanner.nextInt();
				scanner.nextLine(); // 개행 문자 제거
				aRR = Arrays.copyOf(aRR, aRR.length + moreArrange);
				for (; inArray < aRR.length; inArray++) {
					System.out.print(count + "번째 문자열 : ");
					String userStr = scanner.nextLine();
					aRR[inArray] = userStr;
					count++;
				}
				continue;
			} else if (confirm.equalsIgnoreCase("n")) {
				for (String str : aRR) {
					System.out.println(str);
				}
				System.out.println("프로그램 종료");
				return;
			} else {
				System.out.println("입력할 수 없는 값입니다.");
			}
			
			
		}
		
		
	}

}

// 새로 배운점 scanner.nextLine() 는 개행문자를 남기지 않는다
//scanner.nextInt()는 개행 문자(Enter)를 남긴다
//scanner.nextInt() 다음으로 scanner.nextLine()가 오게된다면
//nextLine()에 남은 개행문자가(Enter) nextLine()으로 출력되게된다

//ex) 1번째 문자열 : 2번째 문자열 :  

//**nextInt() → nextInt()** 이어지는경우 개행문자를 제외하고 숫자만 읽는다
//
//nextInt()는 숫자만 뽑고 개행(\n)은 버퍼에 남기지만,
//다음에도 또 nextInt()를 호출하면 그 개행은 무시하고 다음 숫자만 잘 읽어요 // GPT