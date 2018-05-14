package pattern.visitor;

/**
 * 普通员工关注的是工作时间
 * @author minggo
 * @time 2017年7月18日下午2:47:40
 */
public class CommonEmployee extends Employee {

	private String workTime;

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	@Override
	public String getEmployeeInfo() {
		System.out.println("普通员工工时："+workTime);
		return workTime;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visitor(this);
	}

}
