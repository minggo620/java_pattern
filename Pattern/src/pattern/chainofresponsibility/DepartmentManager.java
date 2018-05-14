package pattern.chainofresponsibility;

public class DepartmentManager extends LeaveHandler {

	public DepartmentManager() {
		super(2);
	}

	@Override
	public void approve(ILeave leave) {
		// 向部门主管请假
		System.out.println("---向部门主管---请假");
		System.out.println("理由："+leave.leaveReason());
		System.out.println("---部门主管批准请假---");
	}

}
