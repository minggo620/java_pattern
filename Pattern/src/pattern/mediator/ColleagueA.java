package pattern.mediator;

public class ColleagueA extends AbstractColleague {

	public ColleagueA(AbstractMediator mediator) {
		super(mediator);
	}
	
	public void justDoBsomehing(){
		super.mediator.AdoBsomething();
	}
	
}
