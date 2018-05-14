package pattern.builder;

/**
 * 构建者模式
 * 1.构建的流程在Director身上，不在构建者builder里。
 * 2.构造者模式跟策略模式方法调用流程一样，但是构建返回结果是构建出来的对象。
 * @author minggo
 * @time 2017年7月14日下午2:19:23
 */
public class Client {

	public static void main(String[] args) {
		System.out.println("---指挥构造产品A---");
		IBuilder builderA = new BuilderA();
		Director director = new Director(builderA);
		director.createProduction();
		System.out.println("---指挥构造产品B---");
		IBuilder builderB = new BuilderB();
		director = new Director(builderB);
		director.createProduction();
	}

}
