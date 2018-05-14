package pattern.state;

public class Context {
	
	public static final OpeningState openingState = new OpeningState();
	public static final ClosingState closingState = new ClosingState();
	public static final RunningState runningState = new RunningState();
	public static final StoppingState stoppingState = new StoppingState();
	
	private MetroState metroState;
	
	public void setMetroState(MetroState metroState){
		this.metroState =  metroState;
		this.metroState.setContext(this);
	}
	
	public MetroState getMetroState() {
		return metroState;
	}

	public void open(){
		this.metroState.open();
	}
	
	public void close(){
		this.metroState.close();
	}
	
	public void run(){
		this.metroState.run();
	}
	
	public void stop(){
		this.metroState.stop();
	}
	
}
