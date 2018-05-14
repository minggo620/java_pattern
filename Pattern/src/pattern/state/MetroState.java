package pattern.state;

/**
 * 地铁状态
 * @author minggo
 * @time 2017年7月18日下午4:05:10
 */
public abstract class MetroState {

	public abstract void open();
	public abstract void close();
	public abstract void run();
	public abstract void stop();
	
	protected Context context;
	public void setContext(Context context){
		this.context = context;
	}
	
}
