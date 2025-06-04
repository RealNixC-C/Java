package sec01.exam08_3;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		// TreeMap
		// 키를 자동으 정렬해서 저장(기본은 오름차순)
		
		Map<String, Object> flower = new TreeMap<String, Object>();
		flower.put("name", "장비");
		flower.put("lang", "응원");
		flower.put("price", 10000);
		flower.put("day", 12);
		System.out.println(flower);
		
		// 내림차순
		flower = new TreeMap<String, Object>(Collections.reverseOrder());
		flower.put("name", "장비");
		flower.put("lang", "응원");
		flower.put("price", 10000);
		flower.put("day", 12);
		System.out.println(flower);
		
	}

}
