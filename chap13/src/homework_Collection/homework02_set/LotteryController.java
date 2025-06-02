package homework_Collection.homework02_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
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
		  win.remove(l);
		}
		return result;
	}
	
	public Set<Lottery> searchObject() {
		return lottery;
	}
	
	public Set<Lottery> winObject() {
		if (lottery.size() < 5) return null;
		
		List<Lottery> arrList = new ArrayList<Lottery>(lottery);
		
		while(win.size() < 4) {
			int ranNum = (int)(Math.random() * arrList.size());
			if(win.contains(arrList.get(ranNum))) { // HashSet은 중복을 허용하지 않기 때문에 if문이 없어도 상관없음.
				continue;
			}
			win.add(arrList.get(ranNum));
		}
		return win;
	}
	
	public Set<Lottery> sortedWinObject() {
		List<Lottery> winnerList = new ArrayList<Lottery>(win);
		Collections.sort(winnerList);
		return new LinkedHashSet<Lottery>(winnerList);
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
	
	
	
	
	
	
}
