package pattern.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * 结构对象
 * @author minggo
 * @time 2017年7月18日下午2:51:36
 */
public class EmployeeStructure {
	
	public static List<Employee> createEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			if (random.nextInt(2)>0) {
				Manager manager = new Manager();
				manager.setPerformance("主管的业绩:"+new Random().nextInt(10)*10000+"元");
				list.add(manager);
			}else{
				CommonEmployee commonEmployee = new CommonEmployee();
				commonEmployee.setWorkTime("普通员工工作时间："+new Random().nextInt(7)*8+"小时");
				commonEmployee.getEmployeeInfo();
				list.add(commonEmployee);
			}
		}
		
		return list;
	}
	
}
