package pattern.proxy;

/**
 * 代理类，必须拥有具体实现类，两者都是实现同一个“根”接口
 * @author minggo
 * @time 2017年7月11日下午3:51:52
 */
public class DataManagerProxy implements DataManager {
	
	private DataManager dataManager;
	
	public DataManagerProxy(){
		dataManager = new DataManagerImp();
	}
	
	@Override
	public String queryData() {
		System.out.println("DataManagerProxy我只是个代理而已");
		String result = dataManager.queryData();	
		return result;
	}
	
}
