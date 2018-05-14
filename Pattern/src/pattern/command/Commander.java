package pattern.command;

/**
 * 命令队长
 * @author minggo
 * @time 2017年7月13日上午11:07:32
 */
public class Commander {
	
	private AbstractCommand command;
	public void setCommand(AbstractCommand command){
		this.command = command;
	}
	public void doIt(){
		command.excuteCommand();
	}
}
