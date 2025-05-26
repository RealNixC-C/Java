package homework_polymorphism.homework02.model.vo;

public class Dish extends Menu{
	
	private String ingredients;
	
	public Dish() {
		
	}
	public Dish(String name, int price, String ingredients) {
		super(name, price);
		this.ingredients = ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getIngredients() {
		return ingredients;
	}
	@Override
	public void cook() {
		System.out.println(super.toString() + "재료는" + ingredients + "입니다");
	}
	@Override
	public String toString() {
		return null;
	}
	
	
}
