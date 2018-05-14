package pattern.facade;
/**
 * 门面模式（强调封装）
 * 1.不需要亲力亲为把不需要关注的事做一遍。
 * 2.只关注核心信息的传递。
 * @author minggo
 * @time 2017年7月13日上午10:27:17
 */
public class Client {

	public static void main(String[] args) {
		DoorKeeper doorKeeper = new DoorKeeper();
		doorKeeper.listenVistorContent("我是张三你们老爷的旧友，叙旧来的，麻烦通告一声");
	}

}
