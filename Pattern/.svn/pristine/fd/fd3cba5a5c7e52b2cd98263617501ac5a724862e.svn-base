package pattern.builder;

public class BuilderB implements IBuilder {
	
	public Production production;
	
	public BuilderB(){
		production = new Production();
	}

	@Override
	public void makePartA() {
		System.out.println("产品A的制造A部分");
		production.setPartA("产品B构建partA");
	}

	@Override
	public void makePartB() {
		System.out.println("产品A的制造B部分");
		production.setPartB("产品B构建partB");
	}

	@Override
	public void makePartC() {
		System.out.println("产品A的制造C部分");
		production.setPartC("产品C构建partC");
	}

	@Override
	public Production build() {
		return production;
	}

}
