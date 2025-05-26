package homework_polymorphism.homework01.model.vo;

public class Food extends Product{

	private int expirationDays;
	
	public Food() {
		
	}
	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}
	
	public int getExpirationDays() {
		return expirationDays;
	}
	
	public int calculateDiscountRate() {
		if(expirationDays <= 1) {
			return (int) (getPrice() *  0.2);
		} else if(expirationDays <= 5) {
			return (int) (getPrice() *  0.5);
		} else if(expirationDays <= 10) {
			return (int) (getPrice() *  0.8);
		} else {
			return getPrice();
		}
	}
	@Override
	public int calculatePrice() {
		return calculateDiscountRate();
	}

}
