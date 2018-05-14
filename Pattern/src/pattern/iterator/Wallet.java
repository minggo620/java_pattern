package pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Wallet implements IWallet {

	private List<Money> list = new ArrayList<Money>();
	
	
	
	@Override
	public void addMoney(Money money) {
		list.add(money);
	}

	
	public MoneyIterator getIterator(){
		return new MoneyIterator(list);
	}

}
