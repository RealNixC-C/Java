package sec01.exam04;

import java.util.HashMap;

public class MemberExample {

	public static void main(String[] args) {
		HashMap<Member, String> hashMap = new HashMap<Member, String>();
		
		hashMap.put(new Member("fall"), "value1");
		hashMap.put(new Member("winter"), "value2");
		hashMap.put(new Member("fall"), "value3");
		// 동일한 키는 마지막으로 저장된 키값에 덮어씌여짐
		
		
		// 결과2
		System.out.println(hashMap.size());
	}
}
