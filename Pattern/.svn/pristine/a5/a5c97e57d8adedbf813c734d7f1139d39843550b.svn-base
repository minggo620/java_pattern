package pattern.mediator;

/**
 * 中介者模式
 * 1.使用原则是有3个以上的独立业务两两依赖时采用该模式。
 * 2.体现每一个独立的业务和中介之间相互持有关系。
 * 3.业务的流程只交给中介者持有，相对观察者和代理都是不着重在某一个业务方。
 * 4.解耦的同时，也容易加重中介者逻辑负担。
 * 5.适合做独立产品开发，强调稳定高效。
 * @author minggo
 * @time 2017年7月12日下午4:14:41
 */
public class Client {

	public static void main(String[] args) {
		
		AbstractMediator mediator = new ConcreteMediator();
		
		ColleagueA colleagueA = new ColleagueA(mediator);
		ColleagueB colleagueB = new ColleagueB(mediator);
		ColleagueC colleagueC = new ColleagueC(mediator);
		
		colleagueA.justDoBsomehing();
		colleagueB.justDoCSomething();
		colleagueC.justDoASomething();
	}

}
