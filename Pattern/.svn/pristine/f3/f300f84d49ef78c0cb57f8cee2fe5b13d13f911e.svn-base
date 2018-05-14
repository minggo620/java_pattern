package pattern.memento;

/**
 * 备忘录发起者
 * @author minggo
 * @time 2017年7月19日上午11:30:53
 */
public class Originator {
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Menento createMenento(){
		return new Menento(this.state);
	}
	
	public void restoreMenento(Menento menento){
		this.setState(menento.getState());
	}

}
