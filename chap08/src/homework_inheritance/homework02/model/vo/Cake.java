package homework_inheritance.homework02.model.vo;

public class Cake {

	private double flour;
	private double cream;

	public Cake() {};
	public Cake(double flour, double cream) {
		this.flour = flour;
		this.cream = cream;
	}
	
	public void setFlour(double flour) {
		this.flour = flour;
	}
	public double getFlour() {
		return flour;
	}
	public void setCream(double cream) {
		this.cream = cream;
	}
	public double getCream() {
		return cream;
	}
	public String toString() {
		return "밀가루(g) : " + flour + "(g)\n크림 : " + cream;
	}
}
