package pattern.command;

/**
 * 命令抽象类
 * @author minggo
 * @time 2017年7月13日上午10:59:40
 */
public abstract class AbstractCommand {
	
	protected FiredBunkersGroup firedBunkersGroup;
	protected RushMuzzleGroup rushMuzzleGroup;
	
	public AbstractCommand(){
		firedBunkersGroup = new FiredBunkersGroup();
		rushMuzzleGroup = new RushMuzzleGroup();
	}
	
	public abstract void excuteCommand();
	
}
