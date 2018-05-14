package pattern.chainofresponsibility;

/**
 * 责任链模式
 * 1.关键是建立完成的等级传递链。
 * 2.事件处理器中要给每一处理添加下一级处理器（非最后一级）。
 * @author minggo
 * @time 2017年7月17日下午3:25:49
 */
public class Client {
	
	public static void main(String[] args) {
		
		ILeave leaveA = new LeaveA();
		ILeave leaveB = new LeaveB();
		
		CEO ceo = new CEO();
		DepartmentManager departmentManager = new DepartmentManager();
		departmentManager.setNextHandler(ceo);
		System.out.println("员工A发起3天请假");
		departmentManager.handleLeave(leaveA);
		System.out.println("=========================");
		System.out.println("员工B发起2天请假");
		departmentManager.handleLeave(leaveB);
		
	}

}
