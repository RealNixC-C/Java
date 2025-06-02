package homework_Collection.homework02_set;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LotteryMenu {

	Scanner sc = new Scanner(System.in);
	
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("===== 로또 번호 추첨 =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 추첨 대상 목록 조회");
			System.out.println("4. 당첨 대상 구성");
			System.out.println("5. 정렬된 당첨 대상 확인");
			System.out.println("6. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호: ");
			int userNum = sc.nextInt();
			sc.nextLine();
			
			switch (userNum) {
			case 1:	insertObject();	break;
			case 2:	deleteObject();	break;
			case 3:	searchObject();	break;
			case 4:	winObject(); break;
			case 5:	sortedWinObject(); break;
			case 6:	searchWinner();	break;			
			case 9:	System.out.println("프로그램 종료"); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}

	public void insertObject() {
		System.out.println("===== 1. 추첨 대상 추가 =====");
		System.out.print("추가할 추첨 대상 수 : ");
		int add = sc.nextInt();
		sc.nextLine();
		
		int count = 0;
		while (count < add) {
			System.out.print("이름 : ");
			String inputName = sc.nextLine();
			System.out.print("휴대폰 번호(-빼고) : ");
			String inputPhone = sc.nextLine();
			Lottery lottery = new Lottery(inputName, inputPhone);
			if(lc.lottery.contains(lottery)) {
				System.out.println("중복된 대상입니다. 다시입력하세요.");
				continue;
			}
			lc.insertObject(new Lottery(inputName, inputPhone));
			count++;
		}
		System.out.println(add + "명 추가 완료되었습니다.");
	}
	
	public void deleteObject() {
		System.out.println("===== 2. 추첨 대상 삭제 =====");
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.nextLine();
		
		Lottery lottery = new Lottery(name, phone);
		if(lc.deleteObject(lottery)) {
			System.out.println("삭제 완료되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	
	public void searchObject() {
		System.out.println("===== 3. 추첨 대상 목록 조회 =====");
		System.out.println(lc.searchObject());
	}
	
	public void winObject() {
		System.out.println("===== 4. 당첨 대상 구성 =====");
		Set<Lottery> win = lc.winObject();
		if(win == null) {
			System.out.println("추첨 대상이 4명이상이여야 당첨 대상을 구성할 수 있습니다.");
		} else { 
			System.out.println(win);
		}
	}
	
	public void sortedWinObject() {
		System.out.println("===== 5. 정렬된 당첨 대상 확인 =====");
		Set<Lottery> sortedWinnerList = lc.sortedWinObject();
		Iterator<Lottery> list = sortedWinnerList.iterator();
		while(list.hasNext()) {
			Lottery winners = list.next();
			System.out.println(winners);
		}
	}
	
	public void searchWinner() {
		System.out.println("===== 6. 당첨 대상 검색 =====");
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.nextLine();
		
		Lottery lottery = new Lottery(name, phone);
		
		boolean result = lc.searchWinner(lottery);
		if(result) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("다음 기회에!");
		}
	}
	
}
