package pattern.visitor;

public abstract class Employee {
	
	public abstract void accept(IVisitor visitor);
	
	public abstract String getEmployeeInfo();
	
	
}
