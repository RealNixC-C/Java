package sec01.homework_string.homework01;

public class Run {

	public static void main(String[] args) {
		
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String name = "";
		int age = 0;
		String address = "";
		char gender = ' ';
		
		String[] strArr = str.split("\n");

		for (int i = 0; i < strArr.length; i++) {
			String[] info = strArr[i].split(",");
			for (int j = 0; j < info.length; j++) {

				switch (j) {
				case 0:
					name = info[j];
					break;
				case 1:
					age = Integer.parseInt(info[j]);
					break;
				case 2:
					address = info[j];
					break;
				case 3:
					gender = info[j].charAt(0);
					break;
				}
				
			}
			Person person = new Person(name, age, address, gender);
			System.out.println(person.toString());
		}
	}

}
