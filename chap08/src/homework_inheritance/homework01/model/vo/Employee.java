package homework_inheritance.homework01.model.vo;

public class Employee extends Person {

	private int salary;
	private String dept;
	
	public Employee() {}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		String result = "===" + getName() + "===\n나이 : " + getAge() + "\n키 : " + getHeight() + "\n몸무게 : " 
	+ getWeight() + "\n학년 : " + salary + "\n전공 : " + dept;
		return result;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	
	
}
