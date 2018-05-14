package pattern.state;

public class ClosingState extends MetroState {

	@Override
	public void open() {
		super.context.setMetroState(Context.openingState);
		super.context.open();
	}

	@Override
	public void close() {
		if (super.context.getMetroState()==Context.closingState) {
			System.out.println("地铁关门");
		}
		
	}

	@Override
	public void run() {
		super.context.setMetroState(Context.runningState);
		super.context.run();
	}

	@Override
	public void stop() {
		//下班了关门停车
		super.context.setMetroState(Context.stoppingState);
		super.context.stop();
	}

}
