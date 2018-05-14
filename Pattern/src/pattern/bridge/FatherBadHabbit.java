package pattern.bridge;

public class FatherBadHabbit implements BadHabit {

	@Override
	public void somking() {
		System.out.println("我是爸爸有抽烟的习惯");
	}

	@Override
	public void lie() {
		System.out.println("我是爸爸但重来不撒谎");
	}

}
