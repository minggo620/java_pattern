package pattern.adapter;

/**
 * 适配器模式
 * 为了两边的数据对称输入输出
 * @author minggo
 * @time 2017年7月13日下午5:27:53
 */
public class Client {

	public static void main(String[] args) {
		//日本旅客到中国来想使用中国电流，先有一个日本电流输出适配器
		IChinaElectric chinaElectric = new JanpanElectricAdapter();
		//中国插座通过适配器更换成3口插座
		chinaElectric.chinaElectricSocket();
		//中国电流电压通过适配器转化成110V电流
		chinaElectric.transformChinaTypeElectric();
	}
	
}
