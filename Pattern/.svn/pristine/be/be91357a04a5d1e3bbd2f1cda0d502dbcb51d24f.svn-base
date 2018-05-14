package pattern.state;

public class OpeningState extends MetroState {

	@Override
	public void open() {
		if (super.context.getMetroState()==Context.openingState) {
			System.out.println("地铁门打开");
		}
		
	}

	@Override
	public void close() {
		super.context.setMetroState(Context.closingState);
		super.context.getMetroState().close();
	}

	@Override
	public void run() {
		//不能开
	}

	@Override
	public void stop() {
		//已停止
	}

}
