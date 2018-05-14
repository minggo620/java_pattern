package pattern.decorator;

/**
 * 集成组件同时还要持有一个组件的实例，原因在于能使用组件其他具体子类的方法
 * @author minggo
 * @time 2017年7月13日下午2:34:32
 */
public abstract class Decorator extends Component {
	
	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		System.out.println("先干点集成组件的子类群能干的事情");
		component.operation();
	}
	
	public abstract void doSomethingRelative();
	
}
