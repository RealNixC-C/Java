package homework_intheritance.homework02.model.vo;

public class GreenTea extends Cake {

	private double powder;
	private int cheese;
	
	public GreenTea() {}
	public GreenTea(double flour, double cream, double powder, int cheese) {
		super(flour, cream);
		this.powder = powder;
		this.cheese = cheese;
	}
	public void setpowder(double powder) {
		this.powder = powder;
	}
	public double getpowder() {
		return powder;
	}
	public void setcheese(int cheese) {
		this.cheese = cheese;
	}
	public int getcheese() {
		return cheese;
	}
	
	@Override
	public String toString() {
		return super.toString() + "(g)\n녹차 파우더 : " 
		+ powder + "(g)\n치즈 큐브 : " + cheese + "(개)";
	}
	
}
