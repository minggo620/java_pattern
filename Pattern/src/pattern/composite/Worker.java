package pattern.composite;

public class Worker extends AbstractEmployee {
	
	public Worker(String name,int pay,String position){
		super.name = name;
		super.position = position;
		super.setPay(pay);
	}
}
