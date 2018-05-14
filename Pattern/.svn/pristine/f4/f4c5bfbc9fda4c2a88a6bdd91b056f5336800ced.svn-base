package pattern.flyweight;

import java.util.HashMap;
import java.util.Random;

public class FlyweightFactory {
	
	private static HashMap<String, FlyWeight> flyList = new HashMap<String,FlyWeight>();
	
	public static FlyWeight createFlyWeight(String key){
		
		if (flyList.containsKey(key)) {
			return flyList.get(key);
		}else{
			FlyWeight flyWeight = new FlyWeight();
			flyWeight.setFlyId(new Random().nextInt(1000)+"");
			flyWeight.setWeight(new Random().nextInt(1000));
			flyList.put(key, flyWeight);
			return flyWeight;
		}
		
	}

}
