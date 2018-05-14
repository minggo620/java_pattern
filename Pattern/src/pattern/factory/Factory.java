package pattern.factory;
/**
 * 生产产品的工厂
 * @author minggo
 * @time 2017年7月11日下午5:41:54
 */
public class Factory {

	public static IProduction creatProduction(Class<?> clazz){
		
		if (clazz == ProductionA.class) {
			return new ProductionA();
		}else if (clazz == ProductionB.class) {
			return new ProductionB();
		}	
		return null;
	}

}
