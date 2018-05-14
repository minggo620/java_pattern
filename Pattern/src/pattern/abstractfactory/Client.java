package pattern.abstractfactory;

/**
 * 1.抽象工厂模式针对的对象是工厂的抽象定义。
 * 2.工厂模式针对的对象是生产产品供给封装。
 * @author minggo
 * @time 2017年7月12日上午11:42:20
 */
public class Client {
	
	public static void main(String[] args) {
		
		ProductionAFactory productionAFactory = new ProductionAFactory();
		ProductionBFactory productionBFactory = new ProductionBFactory();
		
		ProductionA productionA = productionAFactory.createProductionA();
		ProductionB productionB = productionBFactory.createProductionB();
		
		productionA.speak();
		productionB.write();
		
	}
}
