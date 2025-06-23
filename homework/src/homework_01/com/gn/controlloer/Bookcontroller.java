package homework_01.com.gn.controlloer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import homework_01.com.gn.model.vo.Book;

public class Bookcontroller extends JDBCconnection{

	List<Book> bookList = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);
	
	
	
	// DB에서 리스트를 가져와 출력하는 메소드로 수정
	public List<Book> list() {
		return bookList;
	}

	
	// insert를 수정하여 ArrayList가 아닌 DB에 저장하도록 변경
	public void insert(Book book) {
		
//		String sql = 
//		
//		conn.prepareStatement(null)
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void insert(Book book) {
//		bookList.add(book);
//	}
	
	
	
	
	
	
//	public void insert(String isbn, int type, String price) {
//		
//		String query = "INSERT INTO books (isbn, type, price) "
//					 + "VALUES (?, ?, ?);";
//		
//		try {
//			psmt = conn.prepareStatement(query);
//			psmt.setString(1, query);
		
	}
