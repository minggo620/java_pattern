package pattern.observer;

/**
 * 黑社会
 * @author minggo
 * @time 2017年7月17日下午1:41:41
 */
public class Triad {
	
	private IUndercover police;
	
	public void addUndercover(IUndercover undercover){
		police = undercover;
	}
	
	public void doBadThing(){
		System.out.println("坏蛋抢劫银行中");
		police.watchBadMan("抢劫银行");
	}
	
}
