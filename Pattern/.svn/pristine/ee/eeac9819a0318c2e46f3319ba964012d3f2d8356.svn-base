package pattern.visitor;

import java.util.List;

/**
 * 访问者模式
 * 
 * @author minggo
 * @time 2017年7月17日下午6:30:24
 */
public class Client {

	public static void main(String[] args) {
		
		List<Employee> list = EmployeeStructure.createEmployee();
		for (Employee employee : list) {
			employee.accept(new Visitor());
		}
	}

}
