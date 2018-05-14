package pattern.composite;

public class EmployeeCompositor extends AbstractCompositor {

	
	@Override
	public void addEmployee(AbstractEmployee employee) {
		super.employeeList.add(employee);
	}

	@Override
	public void removeEmployee(String name) {
		for (AbstractEmployee abstractEmployee : employeeList) {
			if (abstractEmployee.name.equals(name)) {
				super.employeeList.remove(abstractEmployee);
				break;
			}
		}
	}

	@Override
	public void infoEmployee() {
		for (AbstractEmployee abstractEmployee : employeeList) {
			System.out.println(abstractEmployee.name+","+abstractEmployee.position+","+abstractEmployee.getPay());
		}
	}
	
}
