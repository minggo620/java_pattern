package pattern.mediator;

public class ColleagueB extends AbstractColleague {

	public ColleagueB(AbstractMediator mediator) {
		super(mediator);
	}
	
	public void justDoCSomething(){
		super.mediator.BdoCsomething();
	}
}
