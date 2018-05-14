package pattern.memento;

/**
 * 备忘录模式
 * 1.备忘发起者，备忘管理者和备忘录。
 * 2.使用的不多，常见的数据库数据回滚。
 * @author minggo
 * @time 2017年7月18日下午6:32:31
 */
public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("状态正常");
		System.out.println("发起者状态:"+originator.getState());
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMenento(originator.createMenento());
		
		originator.setState("状态变化了，不正常");
		System.out.println("发起者状态："+originator.getState());
		
		originator.restoreMenento(caretaker.getMenento());
		System.out.println("备忘者:恢复状态");
		
		System.out.println("发起者状态："+originator.getState());
	}
}
