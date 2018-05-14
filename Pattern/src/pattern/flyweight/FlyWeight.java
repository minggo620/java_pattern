package pattern.flyweight;

public class FlyWeight {
	
	private String flyId;
	private int weight;
	public String getFlyId() {
		return flyId;
	}
	public void setFlyId(String flyId) {
		this.flyId = flyId;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void conbine(){
		System.out.println("ID:"+getFlyId()+" ,Weight:"+getWeight());
	}
}
