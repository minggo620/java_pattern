package pattern.state;

public class RunningState extends MetroState {

	@Override
	public void open() {
		//不能开门
	}

	@Override
	public void close() {
		//已经close
	}

	@Override
	public void run() {
		System.out.println("地铁行驶中");
	}

	@Override
	public void stop() {
		super.context.setMetroState(Context.stoppingState);
		super.context.stop();
	}

}
