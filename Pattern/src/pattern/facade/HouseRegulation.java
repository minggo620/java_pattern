package pattern.facade;

/**
 * 具体客人会面家规
 * @author minggo
 * @time 2017年7月13日上午10:16:43
 */
public class HouseRegulation implements IHomeRegulation{
	
	@Override
	public void tellHouseKeeper(String content) {
		System.out.println("门卫告诉管家有人拜访，说的内容是："+content);
	}

	@Override
	public void tellHouseOwner(String content) {
		System.out.println("管家告诉老爷有人拜访,说的拜访原因是："+content);
	}

	@Override
	public void planMeeting() {
		System.out.println("管家安排会面");
	}

}
