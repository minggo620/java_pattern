package pattern.flyweight;

import java.util.Random;

/**
 * 享元模式
 * 1.不同于工厂模式是将生产对象保存下来
 * @author minggo
 * @time 2017年7月18日下午6:33:36
 */
public class Client {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			FlyWeight flyWeight = FlyweightFactory.createFlyWeight(new Random().nextInt(10000)+"");
			flyWeight.conbine();
		}
		
	}

}
