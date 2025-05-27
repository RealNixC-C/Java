package homework_intheritance.homework02.model.vo;

public class Chocolate extends Cake {

	private int cherry;
	private int chip;
	
	public Chocolate() {}
	public Chocolate(double flour, double cream, int cherry, int chip) {
		super(flour, cream);
		this.cherry = cherry;
		this.chip = chip;
	}
	public void setCherry(int cherry) {
		this.cherry = cherry;
	}
	public int getCherry() {
		return cherry;
	}
	public void setChip(int chip) {
		this.chip = chip;
	}
	public int getChip() {
		return chip;
	}
	
	@Override
	public String toString() {
		return super.toString() + "(g)\n체리 : " 
		+ cherry + "(개)\n초콜릿 칩 : " + chip + "(개)";
	}
	
}
