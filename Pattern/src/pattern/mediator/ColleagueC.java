package pattern.mediator;

public class ColleagueC extends AbstractColleague{

	public ColleagueC(AbstractMediator mediator) {
		super(mediator);
	}
	
	public void justDoASomething(){
		super.mediator.CdoAsomething();
	}

}
