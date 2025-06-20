package homework_01.com.gn.model.vo;

import java.util.ArrayList;
import java.util.List;

public abstract class Book {
	
	
	
	private String isbn;
	private int price;
	
	public Book() {
		
	}

	public Book(String isbn, int price) {
		this.isbn = isbn;
		this.price = price;
	}
	
	public abstract void printinfo();
	
	
	public void recoverMissingDigit(String isbn) {
		
		// 제일 마지막에 할것
		char checkSymbolChar = isbn.charAt(isbn.length() -1); 
		int checkSymbol =  checkSymbolChar - '0';
		
		int indexAsk = isbn.indexOf("*");
		String noAskStr = isbn.replace("*", "");
		int numToCheck = Integer.parseInt(noAskStr);
		
		
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + "]";
	}
	
	

}
