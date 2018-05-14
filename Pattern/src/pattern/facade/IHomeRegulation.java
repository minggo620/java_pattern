package pattern.facade;

/**
 * 定义可以会面家规
 * @author minggo
 * @time 2017年7月13日上午10:09:56
 */
public interface IHomeRegulation {
	
	public void tellHouseKeeper(String content);
	public void tellHouseOwner(String content);
	public void planMeeting();
	
}
