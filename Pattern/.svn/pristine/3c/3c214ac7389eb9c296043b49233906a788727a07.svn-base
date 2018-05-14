package pattern.strategy;

/**
 * 策略模式
 * 1.相比工厂模式多了doIt方法由Context交给Client 。
 * 2.相对代理模式少了”同根“和条件不是有外边传进来 。
 * 3.工厂构建出非工厂正式产品，策略会构建同一个Context外包装包装。
 * 4.策略强调提供方案，工厂强调提供产品，容易混淆的地方就是”方案就是一种产品“。
 * 
 * @author minggo
 * @time 2017年7月12日上午11:50:19
 */
public class Client {
	
	public static void main(String[] args) {
		
		Context context = null;
		context = new Context(new StrategyA());
		context.doIt();
		
		context = new Context(new StrategyB());
		context.doIt();
		
	}
}
