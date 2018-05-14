package pattern.bridge;

public class SonBadHabbit implements BadHabit {

	@Override
	public void somking() {
		System.out.println("我是儿子但是我重来不抽烟");
	}

	@Override
	public void lie() {
		System.out.println("我是儿子我有撒谎的习惯");
	}

}
