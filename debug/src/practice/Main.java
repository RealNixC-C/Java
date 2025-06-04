package practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
	
		Set<String> hashset = new HashSet<String>();
		hashset.add("중복불가");
		hashset.add("중복불가");
		hashset.add("중복불가");
		hashset.add("중복불가");
		System.out.println(hashset.size());
		
		Set<String> treeset = new TreeSet<String>();
		treeset.add("1. 순서대로");
		treeset.add("라");
		treeset.add("가");
		treeset.add("다");
		treeset.add("나");
		System.out.println(treeset);
		
		
	}
	
}
