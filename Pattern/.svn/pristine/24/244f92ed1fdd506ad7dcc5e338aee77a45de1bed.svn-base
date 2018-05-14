package pattern.observer;
/**
 * 观察者模式
 * 1.被观察者需要持有一个或者多个观察者。
 * 2.区别于代理模式是功能不一样，观察者负责反馈结果，代理是同根负责做同样的事情。
 * 3.订阅者是一个接口完成，被订阅的这类就不单独抽出来写，这个代码已经足够说明这个模式。
 * @author minggo
 * @time 2017年7月17日下午2:13:54
 */
public class Client {

	public static void main(String[] args) {
		//创建一个卧底
		IUndercover undercover = new Police();
		//发现一个坏蛋
		Triad triad = new Triad();
		//安插卧底给坏蛋
		triad.addUndercover(undercover);
		//坏蛋开始干坏事
		triad.doBadThing();
		//马上得到卧底汇报，运行一下就知道
	}

}
