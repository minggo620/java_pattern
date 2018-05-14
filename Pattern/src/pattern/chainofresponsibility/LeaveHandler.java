package pattern.chainofresponsibility;

/**
 * 请假
 * @author minggo
 * @time 2017年7月17日下午3:02:21
 */
public abstract class LeaveHandler {
	
	private LeaveHandler nextHandler;
	public int requestLeaveDay = 0;
	public LeaveHandler(int leaveDay){
		this.requestLeaveDay = leaveDay;
	}
	
	public void setNextHandler(LeaveHandler nextHandler){
		this.nextHandler = nextHandler;
	}
	
	public void handleLeave(ILeave leave){
		if (requestLeaveDay == leave.leaveDays()) {
			this.approve(leave);
		}else{
			if (this.nextHandler!=null) {
				System.out.println(this.getClass().getSimpleName()+"没有权利批准的请假");
				this.nextHandler.handleLeave(leave);
			}else{
				System.out.println("没有下一级");
			}
		}
		
	}
	public abstract void approve(ILeave leave);

}
