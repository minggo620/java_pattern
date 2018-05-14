package pattern.visitor;

/**
 * 主管关注的是业绩
 * @author minggo
 * @time 2017年7月18日下午2:48:09
 */
public class Manager extends Employee {
	
	
	private String performance;

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	@Override
	public String getEmployeeInfo() {
		System.out.println("主管业绩:"+performance);
		return performance;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visitor(this);
	}
	
}
