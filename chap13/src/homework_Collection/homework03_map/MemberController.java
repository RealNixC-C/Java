package homework_Collection.homework03_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {

	Map<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMember(String id, Member m) {
		if(map.containsKey(id)) {
			return false;
		}
		map.put(id, m);
		return true;
	}
	
	public String logIn(String id, String password) {
		if(map.containsKey(id)) {
			Member member = map.get(id);
			if(member.getPassword().equals(password)) {
				return member.getName();
			}
		} 
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id)) {
			Member member = map.get(id);
			if(member.getPassword().equals(oldPw)) {
				member.setPassword(newPw);
				return true;
			}
		} 
		return false;
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
		
	public TreeMap<String, String> sameName(String name) {
		
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		
		Set<String> setMap = map.keySet();
		Iterator<String> iterator = setMap.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Member member = map.get(key);
			if(member.getName().equals(name)) {
				treeMap.put(key, member.getName());
			}
		}
//		for (String key : setMap) {
//			Member member = map.get(key);
//			if(member.getName().equals(name)) {
//				treeMap.put(key, member.getName());
//			}
//		}
		
		return treeMap;
	}
	
	
	
	
	
	
	
}
