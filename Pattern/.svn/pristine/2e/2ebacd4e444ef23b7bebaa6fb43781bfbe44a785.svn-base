package pattern.factory;

/**
 * 工厂模式(1.区别于策略模式返回的是产品本身，不具有使用产品的操作方法 2.区别于享元模式是没有把产品保存在列表当中重用)
 * @author minggo
 * @time 2017年7月12日上午11:48:13
 */
public class Client {

	public static void main(String[] args) {
		
		IProduction productionA = Factory.creatProduction(ProductionA.class);
		productionA.speak();
		productionA.jump();
		
		IProduction productionB = Factory.creatProduction(ProductionB.class);
		productionB.speak();
		productionB.jump();
		
	}

}
