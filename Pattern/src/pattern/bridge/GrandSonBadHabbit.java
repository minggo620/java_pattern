package pattern.bridge;

public class GrandSonBadHabbit implements BadHabit{

	@Override
	public void somking() {
		System.out.println("我是孙子但我重来不抽烟");
	}

	@Override
	public void lie() {
		System.out.println("我是孙子但我重来不撒谎");
	}

}
