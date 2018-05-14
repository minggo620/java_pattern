package pattern.composite;
/**
 * 组合模式
 * 1.强调将有关系的类组合形成结构。
 * 2.跟装饰器模式区别是不修改原有的功能。
 * 3.装饰器模式强调功能类的扩展。
 * @author minggo
 * @time 2017年7月13日下午5:24:24
 */
public class Client {

	public static void main(String[] args) {
		Leader leader = new Leader("leader chan", 100000, "经理");
		Worker worker = new Worker("work li", 2000, "专员");
		
		EmployeeCompositor compositor = new EmployeeCompositor();
		compositor.addEmployee(leader);
		compositor.addEmployee(worker);
		compositor.infoEmployee();
	}

}
