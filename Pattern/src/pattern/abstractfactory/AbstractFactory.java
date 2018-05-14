package pattern.abstractfactory;

/**
 * 抽象工厂
 * @author minggo
 * @time 2017年7月11日下午6:44:52
 */
public abstract class AbstractFactory implements IFactory{
	
	@Override
	public ProductionA createProductionA() {
		System.out.println("这是抽象工厂createProductionA，但什么也不做，交给继承的子类实现");
		return null;
	}
	@Override
	public ProductionB createProductionB() {
		System.out.println("这是抽象工厂createProductionB，但什么也不做，交给继承的子类实现");
		return null;
	}

}
