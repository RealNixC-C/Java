package sec01.exam04.quiz;

import java.util.Objects;

public class Food {

	private String name;
	private int price;

	public Food() {
	}

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Food food) {
			if (name.equals(food.name) && price == food.price) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return name + ":" + price;
	}
	
	
	
}
