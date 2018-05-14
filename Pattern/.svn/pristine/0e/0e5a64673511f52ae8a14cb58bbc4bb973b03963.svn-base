package pattern.iterator;

import java.util.List;

public class MoneyIterator {
	
	private List<Money> list;
	
	private int currentIndex = 0;
	
	public MoneyIterator(List<Money> list){
		this.list = list;
	}
	
	
	public boolean hasNext(){
		
		if(currentIndex<list.size()){
			return true;
		}
		return false;
		
	}
	
	public Money next(){
		
		if (hasNext()) {
			return list.get(currentIndex++);
		}
		
		return null;
	}
	
}
