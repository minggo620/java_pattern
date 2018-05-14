package pattern.bridge;

public class Son extends Father {

	private BadHabit badHabit;
	
	public Son(BadHabit badHabit) {
		super(badHabit);
		this.badHabit = badHabit;
	}

	public void doBadHabbit(){
		badHabit.lie();
	}

}
