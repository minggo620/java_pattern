package pattern.mediator;


/**
 * 具体中介者实现类
 * @author minggo
 * @time 2017年7月12日下午3:57:39
 */
public class ConcreteMediator extends AbstractMediator {
	
	public void scheduling(Class<?> clazz){
		if(clazz == ColleagueA.class){
			this.AdoBsomething();
		}else if(clazz == ColleagueB.class){
			this.BdoCsomething();
		}else if(clazz == ColleagueC.class){
			this.CdoAsomething();
		}
	}
	
	@Override
	public void AdoBsomething() {
		System.out.println("我是A来完成B需要的任务");
	}

	@Override
	public void BdoCsomething() {
		System.out.println("我是B来完成C需要的任务");
	}

	@Override
	public void CdoAsomething() {
		System.out.println("我是C来完成A需要的任务");
	}
	
}
