package homework_Collection.homework02_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LotteryController {

	Set<Lottery> lottery = new HashSet<Lottery>();
	Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		boolean result = lottery.remove(l);
		if(result == true && win != null) {
			return win.remove(l);
		}
		return result;
	}
	
	public Set<Lottery> searchObject() {
		return lottery;
	}
	
	public Set<Lottery> winObject() {
		if (lottery.size() < 5) return null;
		List<Lottery> arrList = new ArrayList<Lottery>(lottery);
		
		int count = 0;
		while(count < 4) {
			int ranNum = (int)(Math.random() * arrList.size());
			
		}
		
		
	}
	
	public Set<Lottery> sortedWinObject() {
		Collections.sort();
	}
	
//	public boolean searchWinner(Lottery l) {
//		
//	}
//	
	
	
	
	
	
}
