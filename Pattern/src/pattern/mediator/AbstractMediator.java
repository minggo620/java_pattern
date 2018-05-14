package pattern.mediator;

/**
 * 中介抽象类
 * @author minggo
 * @time 2017年7月12日下午3:15:59
 */
public abstract class AbstractMediator {
	
	public abstract void AdoBsomething();
	public abstract void BdoCsomething();
	public abstract void CdoAsomething();
	
	protected ColleagueA colleagueA;
	protected ColleagueB colleagueB;
	protected ColleagueC colleagueC;
	
	public AbstractMediator(){
		colleagueA = new ColleagueA(this);
		colleagueB = new ColleagueB(this);
		colleagueC = new ColleagueC(this);
	}
	
}
