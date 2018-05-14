package pattern.strategy;

/**
 * 策略上下文(1.相比工厂模式多了doIt方法由Context交给Client 
 * 2.相对代理模式少了”同根“和条件不是有外边传进来 
 * 3.工厂构建出非工厂正式产品，策略会构建同一个Context外包装包装
 * 4.策略强调提供方案，工厂强调提供产品，容易混淆的地方就是”方案就是一种产品“)
 * @author minggo
 * @time 2017年7月11日下午5:11:33
 */
public class Context {
	
	private IStrategy strategy;
	
	public Context(IStrategy strategy){
		this.strategy = strategy;
	}
	
	public void doIt(){
		System.out.println("由我Context说开始干具体策略才能干");
		strategy.doIt();
	}
}
