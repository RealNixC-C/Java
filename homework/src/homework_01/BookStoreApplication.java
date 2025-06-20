package homework_01;

import java.util.Scanner;

import homework_01.com.gn.controlloer.Bookcontroller;
import homework_01.com.gn.model.vo.Book;
import homework_01.com.gn.model.vo.Novel;
import homework_01.com.gn.model.vo.Poem;

public class BookStoreApplication {

	private static Scanner sc = new Scanner(System.in);
	private static Bookcontroller bc = new Bookcontroller();
	
	public static void main(String[] args) {

		while(true) {
			System.out.print("책 종류를 입력하세요 (소설/시): ");
			String type = sc.nextLine();
			Book book;
			
			switch (type) {
			case "시":
				book = input(new Poem());
				break;
			case "소설":
				book = input(new Novel());
				break;

			default:
				System.out.println("잘못된 종류입니다. 다시 입력하세요.");
				continue;
			}
			
			while (true) {
				System.out.print("입력을 종료하시겠습니까? (y/Y 입력 시 종료): ");
				String exit = sc.nextLine();
				if("y".equalsIgnoreCase(exit)) {
					System.out.println("\n===== 도서 목록 =====");
					bc.list();
					bc.avgPrice();
					return;
				} else if("n".equalsIgnoreCase(exit)) {
					break;
				}
				
			}
			
		}

	}
	
	
	public static Book input(Book book) {
		
		String isbn = "";
		int price = 0;
		
		while (true) {
			System.out.print("ISBN을 입력하세요 (13자리, * 포함 가능): ");
			isbn = sc.nextLine();
			// 유효성 검사
			boolean result = isValidISBN(isbn);
			if(!result) {
				System.out.println("유효하지 않은 ISBN입니다");
				continue;
			}
			book.setIsbn(isbn);
			break;
		}
		
		// 이자리에 4번문제
		
		while (true) {
			try {
				System.out.print("가격을 입력하세요: ");
				price = sc.nextInt();
				sc.nextLine();
				
				book.setPrice(price);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다.");
				sc.nextLine();
				continue;
			}

		}
		return book;
	}
	
	
	public static boolean isValidISBN(String isbn) {
		
		
		int count = 0;
		boolean result = true;
		
		for (int i = 0; i < isbn.length(); i++) {
			if(isbn.charAt(i) == '*') {
				count++;
			}
		}
		if(isbn.length() != 13 || count > 1) {
			result = false;
		}
		return result;
	}
	
	
	
	
	

}
