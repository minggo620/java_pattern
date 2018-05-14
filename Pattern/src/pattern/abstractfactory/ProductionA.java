package pattern.abstractfactory;

/**
 * 产品A
 * @author minggo
 * @time 2017年7月11日下午5:40:26
 */
public class ProductionA implements IProductionA {

	@Override
	public void speak() {
		System.out.println("ProductionA speak");
		
	}

	@Override
	public void jump() {
		System.out.println("ProductionA jump");
		
	}
	
}
