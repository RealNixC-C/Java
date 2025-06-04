package homework_Collection.homework03_map;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MemberMenu {

	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("(주)닉스에 오신것을 환영합니다.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
			case 1:	joinMember(); break;
			case 2:	logIn(); memberMenu(); break;
			case 3:	sameName();	break;
			case 9:	System.out.println("프로그램을 종료합니다"); return;
			default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	public void memberMenu() {
		
		while (true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("회원 메뉴는 회원만 접근할 수 있습니다.");
			System.out.println("먼저 회원가입, 로그인을 해주세요.");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
			case 1: changePassword(); break;
			case 2:	changeName(); break;
			case 3:	System.out.println("로그아웃 되었습니다."); return; 
			default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); 	break;
			}
		}
	}
	
	public void joinMember() {
		
		while (true) {
			System.out.println("=== 1. 회원가입 ===");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			Member member = new Member(pw, name);
			boolean result = mc.joinMember(id, member);
			if(result) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				return;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void logIn() {
		
		while(true) {
			System.out.println("=== 2. 로그인 ===");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
		
			String result = mc.logIn(id, pw);
			if(result != null) {
				System.out.println(result + "님, 환영합니다!");
				return;
			}
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
		}
	}
	
	public void changePassword() {
		
		while (true) {
			System.out.println("=== 1. 비밀번호 바꾸기 ===");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("현재 비밀번호 : ");
			String currentPw = sc.nextLine();
			System.out.print("새로운 비밀번호 : ");
			String newPw = sc.nextLine();
			
			boolean result = mc.changePassword(id, currentPw, newPw);
			
			if (result) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				return;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void changeName() {
		
		while (true) {
			System.out.println("=== 2. 이름 바꾸기 ===");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			String currnetName = mc.logIn(id, pw);
			if(currnetName != null) {
				System.out.println("현재 설정된 이름 : " + currnetName);
				System.out.print("변경할 이름 : ");
				String newName = sc.nextLine();
				mc.changeName(id, newName);
				System.out.println("이름 변경에 성공하였습니다.");
				return;
			} else {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void sameName() {
		System.out.println("=== 3. 같은 이름 회원 찾기 ===");
		System.out.print("검색할 이름 : ");
		String searchName = sc.nextLine();
		TreeMap<String, String> result = mc.sameName(searchName);
		Set<Map.Entry<String, String>> setResult = result.entrySet();
		Iterator<Map.Entry<String, String>> iteratorResult = setResult.iterator();
		while(iteratorResult.hasNext()) {
			Map.Entry<String, String> entry = iteratorResult.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(value + "-" + key);
		}
		
	}
	
	
}
