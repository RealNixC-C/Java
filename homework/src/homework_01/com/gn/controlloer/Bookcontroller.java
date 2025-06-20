package homework_01.com.gn.controlloer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import homework_01.com.gn.model.vo.Book;

public class Bookcontroller extends JDBCconnection{

	List<Book> bookList = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);
	//
	
	public void list() {
		for (Book book : bookList) {
			book.printinfo();
		}
	}

	public void insert(Book book) {
		// ISBN 유효성 검사
		String isbn = "";
		int price = 0;
		
		while (true) {
			System.out.print("ISBN을 입력하세요 (13자리, * 포함 가능): ");
			 isbn = sc.nextLine();
			boolean result = isValidISBN(isbn);
			if(!result) {
				System.out.println("유효하지 않은 ISBN입니다");
				continue;
			}
			book.setIsbn(isbn);
			break;
		}
		// isbn수정코드 제일 마지막에
		// book.recoverMissingDigit(isbn);
		
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
		bookList.add(book);
	}
	
	public void insertIntoDB(String isbn, int type, String price) {
		
		String query = "INSERT INTO books (isbn, type, price) "
					 + "VALUES (?, ?, ?);";
		
		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, query);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}


	public void avgPrice() {
		int sum = 0;
		for (Book book : bookList) {
			sum += book.getPrice();
		}
		double avg = (double) sum / bookList.size();
		System.out.println();
		System.out.printf("총 평균 가격 : %.2f원", avg);
	}
	
	public boolean isValidISBN(String isbn) {
		
		
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
