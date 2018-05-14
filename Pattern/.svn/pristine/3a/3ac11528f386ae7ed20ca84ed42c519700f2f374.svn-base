package pattern.decorator;

/**
 * 装饰器模式
 * 1.核心构建一个装饰器，继承组件抽象类和持有一个组件实例。
 * 2.解决多继承，变动较大业务模块设计
 * @author minggo
 * @time 2017年7月13日上午11:22:48
 */
public class Client {

	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		Decorator decorator = new ConcreteDecoratorA(component);
		decorator.operation();
		decorator.doSomethingRelative();
	}

}
