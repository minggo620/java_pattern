package pattern.state;

/**
 * 状态模式
 * 1.跟策略一样的是都在Context中执行操作方法。
 * 2.跟策略不一样的是每种状态执行会影响其他状态执行的结果。
 * @author minggo
 * @time 2017年7月18日下午5:10:47
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setMetroState(new OpeningState());
		
		context.open();
		context.close();
		context.run();
		context.stop();
		
	}

}
