package pattern.bridge;

public class Father {
	
	private BadHabit badHabit;
	
	public Father(BadHabit badHabit){
		this.badHabit = badHabit;
	}
	
	public void doBadHabit(){
		badHabit.somking();
	}
}
