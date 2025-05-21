package homework_object.homework05.model.vo;

public class Student {

	private int studentNum;
	private String name;
	private char classRoom;
	private static int count;
	
	public Student() {
		count++;
		studentNum = count;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	public char getClassRoom() {
		return classRoom;
	}
	public int getstudentNum() {
		return studentNum;
	}
}
