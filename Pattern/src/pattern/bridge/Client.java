package pattern.bridge;

/**
 * 桥接模式
 * 1.处理面向对象继承耦合问题。
 * 2.符合开闭原则。
 * 3.灵活扩展性强。
 * @author minggo
 * @time 2017年7月12日下午12:50:15
 */
public class Client {

	
	public static void main(String[] args) {
		
		Father father = new Father(new FatherBadHabbit());
		Son son = new Son(new SonBadHabbit());
		GrandSon grandSon = new GrandSon(new GrandSonBadHabbit());
		
		father.doBadHabit();
		son.doBadHabbit();
		grandSon.doBadHabbit();
		
	}
}
