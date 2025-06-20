package homework_01.com.gn.model.vo;

public class Novel extends Book {
	
	public Novel() {
	}

	public Novel(String isbn, int price) {
		super(isbn, price);
	}

	@Override
	public void printinfo() {
		System.out.println("[소설] ISBN: " + getIsbn() + ", 가격: " + getPrice() + "원");
	}

}
