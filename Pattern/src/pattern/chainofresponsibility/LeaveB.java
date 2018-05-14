package pattern.chainofresponsibility;

public class LeaveB implements ILeave {

	@Override
	public int leaveDays() {
		return 2;
	}

	@Override
	public String leaveReason() {
		return "加班太辛苦回去休息两天";
	}

}
