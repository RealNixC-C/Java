package homework_01.com.gn.model.vo;

public class Poem extends Book {

	
	public Poem() {
	}

	public Poem(String isbn, int price) {
		super(isbn, price);
	}

	@Override
	public void printinfo() {
		System.out.println("[시] ISBN: " + getIsbn() + ", 가격: " + getPrice() + "원");
	}

}
