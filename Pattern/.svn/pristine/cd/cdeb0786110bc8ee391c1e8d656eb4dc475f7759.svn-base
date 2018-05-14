package pattern.chainofresponsibility;

public class CEO extends LeaveHandler {

	public CEO(){
		super(3);
	}
	
	@Override
	public void approve(ILeave leave) {
		//向CEO请假
		System.out.println("---向CEO---请假");
		System.out.println("理由:"+leave.leaveReason());
		System.out.println("---CEO批准请假---");
	}

}
