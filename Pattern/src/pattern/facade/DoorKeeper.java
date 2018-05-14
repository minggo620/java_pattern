package pattern.facade;

/**
 * 门卫
 * @author minggo
 * @time 2017年7月13日上午10:17:31
 */
public class DoorKeeper {
	private IHomeRegulation homeRegulation;
	
	public DoorKeeper(){
		homeRegulation = new HouseRegulation();
	}
	
	public void listenVistorContent(String content){
		homeRegulation.tellHouseKeeper(content);
		homeRegulation.tellHouseOwner(content);
		homeRegulation.planMeeting();
	}
}
