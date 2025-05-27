package homework_intheritance.homework01;

import java.util.Scanner;

import homework_intheritance.homework01.model.vo.Employee;
import homework_intheritance.homework01.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Student[] student = new Student[3];
		
		student[0] = new Student("김철수", 20, 178.2, 70.0 ,1, "정보시스템공학과");
		student[1] = new Student("이영희", 23, 167.2, 54.0 ,4, "물리학과");
		student[2] = new Student("홍길동", 21, 196.6, 86.0 ,2, "경영학과");
		
		for (Student info : student) {
			System.out.println(info.toString());
		}
		
		Employee[] employee = new Employee[10];
		int count = 0;
		
		System.out.println("=== 사원 입력 받기===");
		stop: while (true) {
			System.out.print("이름 : ");
			String name = scanner.nextLine();
			System.out.print("나이 : ");
			int age = scanner.nextInt();
			System.out.print("키 : ");
			double height = scanner.nextDouble();
			System.out.print("몸무게 : ");
			double weight = scanner.nextDouble();
			System.out.print("급여 : ");
			int salary = scanner.nextInt();
			System.out.print("부서 : ");
			scanner.nextLine(); // 개행소비
			String dept = scanner.nextLine();
			
			employee[count] = new Employee(name, age, height, weight, salary, dept);
			count ++;
			
			while(true)	{	 
			System.out.print("계속 추가하시겠습니까?");
			String addMore = scanner.nextLine();
			if("y".equalsIgnoreCase(addMore)) {
				break;
			} else if ("n".equalsIgnoreCase(addMore)) {
				break stop;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
			
			}
		}
		for(int i = 0; i < count; i++) {
			System.out.println(employee[i].toString());
		}
	}

}
