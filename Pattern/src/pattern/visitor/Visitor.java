package pattern.visitor;

public class Visitor implements IVisitor {

	@Override
	public void visitor(Manager manager) {
		manager.getEmployeeInfo();
	}

	@Override
	public void visitor(CommonEmployee commonEmployee) {
		commonEmployee.getEmployeeInfo();
	}

}
