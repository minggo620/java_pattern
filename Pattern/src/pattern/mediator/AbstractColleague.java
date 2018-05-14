package pattern.mediator;

/**
 * 交易者抽象类
 * @author minggo
 * @time 2017年7月12日下午3:21:19
 */
public abstract class AbstractColleague {
	protected AbstractMediator mediator;
	
	public AbstractColleague(AbstractMediator mediator){
		this.mediator = mediator;
	}
	
}
