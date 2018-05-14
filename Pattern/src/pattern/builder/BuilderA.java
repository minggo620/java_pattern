package pattern.builder;

public class BuilderA implements IBuilder {

	private Production production;
	
	public BuilderA(){
		production = new Production();
	}
	
	@Override
	public void makePartA() {
		System.out.println("产品A的制造A部分");
		production.setPartA("产品A的partA");

	}

	@Override
	public void makePartB() {
		System.out.println("产品A的制造B部分");
		production.setPartB("产品A的partB");

	}

	@Override
	public void makePartC() {
		//不需要这部分功能
		System.out.println("产品A的不需要具备partC功能");
	}

	@Override
	public Production build() {
		
		return production;
	}

}
