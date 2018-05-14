package pattern.command;

/**
 * 炸碉堡命令
 * @author minggo
 * @time 2017年7月13日上午11:05:26
 */
public class FireBunkersCommand extends AbstractCommand {

	@Override
	public void excuteCommand() {
		super.firedBunkersGroup.fireBunkers();
	}

}
