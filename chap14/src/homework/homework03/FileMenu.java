package homework.homework03;

import java.util.Scanner;

public class FileMenu {

	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			switch (number) {
			case 1:	fileSave();	break;
			case 2:	fileOpen();	break;
			case 3:	fileEdit();	break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	public void fileSave() {
		
		StringBuilder strBuilder = new StringBuilder();
		
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.nextLine();
			if ("ex끝it".equals(str)) {
				while (true) {
					System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
					String fileName = sc.nextLine();
					if(fc.checkName(fileName)) {
						System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니다? (y/n) : ");
						if(sc.nextLine().equalsIgnoreCase("y")) {
							fc.fileSave(fileName, strBuilder);
							return;
						} else if(sc.nextLine().equalsIgnoreCase("n")) {
							continue;
						} else {
							System.out.println("잘못된 입력입니다.");
							continue;
						}
					} else {
						fc.fileSave(fileName, strBuilder);
						return;
					}
				}
			}
			strBuilder.append(str);
		}
	}
	
	public void fileOpen() {
		StringBuilder strBuilder = new StringBuilder();
		System.out.print("열 파일 명 : ");
		String fileName = sc.nextLine();
		if(fc.checkName(fileName)) {
			strBuilder = fc.fileOpen(fileName);
			System.out.println(strBuilder);
		} else {
			System.out.println("없는 파일입니다.");
		}
	}
	
	public void fileEdit() {
		
	}
	
}
