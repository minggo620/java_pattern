package pattern.templatemethod;

public class ModelB extends AbstractModel {

	@Override
	public void operationA() {
		System.out.println("模型B操作方法A");
	}

	@Override
	public void operationB() {
		System.out.println("模型B操作方法B");
	}

	@Override
	public void operationC() {
		System.out.println("模型B操作方法C");
	}

}
