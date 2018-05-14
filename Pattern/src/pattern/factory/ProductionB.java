package pattern.factory;
/**
 * 产品B
 * @author minggo
 * @time 2017年7月11日下午5:40:11
 */
public class ProductionB implements IProduction {

	@Override
	public void speak() {
		System.out.println("ProductionB speak");
		
	}

	@Override
	public void jump() {
		System.out.println("ProductionB jump");
		
	}

}
