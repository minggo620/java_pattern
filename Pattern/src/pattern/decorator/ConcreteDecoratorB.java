package pattern.decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void doSomethingRelative() {
		System.out.println("ConcreteDecoratorB干点其他相关的事");
	}
	
}
