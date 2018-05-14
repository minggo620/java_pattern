package pattern.decorator;

/**
 * 组件的具体实现
 * @author minggo
 * @time 2017年7月13日下午2:19:11
 */
public class ConcreteComponent extends Component {

	@Override
	public void operation() {
		System.out.println("子群中其中一个组件具体实现类重写抽象方法");
	}
	
	protected void operactionSelf(){
		System.out.println("组件具体实现类执行自己定义的方法");
	}
	
}
