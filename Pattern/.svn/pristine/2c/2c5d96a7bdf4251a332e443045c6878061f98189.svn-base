package pattern.builder;

public class Director {
	
	private IBuilder builder;
	
	public Director(IBuilder builder){
		this.builder = builder;
	}
	
	public Production createProduction(){
		builder.makePartA();
		builder.makePartB();
		builder.makePartC();
		
		return builder.build();
	}
}
