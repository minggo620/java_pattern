package pattern.templatemethod;

/**
 * 模板方法模式，就是方法的封装
 * @author minggo
 * @time 2017年7月14日上午11:48:08
 */
public class Client {

	public static void main(String[] args) {
		ModelA  modela = new ModelA();
		ModelB modelb = new ModelB();
		
		modela.operationA();
		modela.operationB();
		
		modelb.operationA();
		modelb.operationB();
	}

}
