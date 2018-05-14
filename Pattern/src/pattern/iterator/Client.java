package pattern.iterator;

/**
 * 迭代器模式
 * 1.自己封装一个迭代器情况极少，面向对象语言基本提供了迭代器。
 * 2.可以做一些扩展，比如前序遍历，中序遍历和后续遍历算法迭代封装。
 * @author minggo
 * @time 2017年7月12日下午5:48:41
 */
public class Client {

	public static void main(String[] args) {
		
		Wallet wallet = new Wallet();
		for (int i = 0; i < 10; i++) {
			Money money = new Money();
			money.setName("RNB");
			money.setValue(i);
			
			wallet.addMoney(money);
		}
		
		MoneyIterator iterator = wallet.getIterator();
		
		while (iterator.hasNext()) {
			Money money = iterator.next();
			System.out.println(money.getName()+" " +money.getValue());
		}
		
	}

}
