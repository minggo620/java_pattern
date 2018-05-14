package pattern.composite;

public class Leader extends AbstractEmployee {
	
	public Leader(String name,int pay,String position){
		super.name = name;
		super.setPay(pay);
		super.position = position;
	}

}
