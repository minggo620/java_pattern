package pattern.command;
/**
 * 命令模式
 * 1.也是强调封装命令使得请求者和实现者解耦。
 * 2.相对面门模式，多了是对命令（发情的事情源）的封装，相同的是都有执行的和调度者。
 * 3.命令模式关注问题是解耦问题。
 * 4.策略模式关注问题是算法替代问题。
 * 5.最大的不同在于策略模式是命令模式接收者（UML图上容易理解）
 * @author minggo
 * @time 2017年7月13日上午11:11:29
 */
public class Client {

	public static void main(String[] args) {
		
		//把队长叫过来
		Commander commander = new Commander();
		//要求炸碉堡
		AbstractCommand command = new FireBunkersCommand();
		//队长接受命令
		commander.setCommand(command);
		//队长执行命令(但你重来都不知道有两个组，一个叫炸碉堡组，一个叫扑枪口组)
		commander.doIt();
		
	}

}
