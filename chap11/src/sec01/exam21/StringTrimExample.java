package sec01.exam21;

public class StringTrimExample {

	public static void main(String[] args) {
		
		String tel1 = "   02";
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		
//		String trim1 = tel1.trim();
//		String trim2 = tel2.trim();
//		String trim3 = tel3.trim();
//		
//		System.out.println(trim1);
//		System.out.println(trim2);
//		System.out.println(trim3);
//		
//		String phone = trim1 + "-" + trim2 + "-" + trim3;
//		System.out.println(phone);
		
		String phone = tel1.trim() + "-" + tel2.trim() + "-" + tel3.trim();
		System.out.println(phone);
		
	}
	
}
