package pattern.singleton;

/**
 * 单例模式
 * @author minggo
 * @time 2017年7月11日下午3:47:21
 */
public class Singleton {
	
	private static Singleton singleton = null;
	
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		
		if(singleton == null){
			synchronized (Singleton.class) {
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
	public void speak(){
		System.out.println("我就是一个单例");
	}
	
}
