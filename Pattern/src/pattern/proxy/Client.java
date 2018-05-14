package pattern.proxy;

/**
 * 代理模式特点：代理类，必须拥有具体实现类，两者都是实现同一个“根”接口
 * @author minggo
 * @time 2017年7月12日上午11:48:40
 */
public class Client {

	public static void main(String[] args) {
		
		DataManagerProxy dataManagerProxy = new DataManagerProxy();
		dataManagerProxy.queryData();

	}

}
