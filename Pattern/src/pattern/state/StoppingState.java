package pattern.state;

public class StoppingState extends MetroState {

	@Override
	public void open() {
		super.context.setMetroState(Context.openingState);
		super.context.open();
	}

	@Override
	public void close() {
		 super.context.setMetroState(Context.closingState);
		 super.context.close();
	}

	@Override
	public void run() {
		super.context.setMetroState(Context.runningState);
		super.context.run();
	}

	@Override
	public void stop() {
		System.out.println("地铁已经停止");
	}

}
