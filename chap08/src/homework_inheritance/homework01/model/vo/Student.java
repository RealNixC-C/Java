package homework_inheritance.homework01.model.vo;

public class Student extends Person {

	private int grade;
	private String major;
	
	public Student() {}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}

	@Override
	public String toString() {
		String result = "===" + getName() + "===\n나이 : " + getAge() + "\n키 : " + getHeight() + "\n몸무게 : " 
	+ getWeight() + "\n학년 : " + grade + "\n전공 : " + major;
		return result;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	
	
	
	
}
