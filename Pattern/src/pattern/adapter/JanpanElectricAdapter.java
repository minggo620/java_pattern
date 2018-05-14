package pattern.adapter;

public class JanpanElectricAdapter extends JanpanElectric implements IChinaElectric{

	@Override
	public void transformChinaTypeElectric() {
		super.transformJapanElectric();
		System.out.println("将中国电压220V电流转化成110V电流");
	}

	@Override
	public void chinaElectricSocket() {
		super.japanElectricSocket();
		System.out.println("将中国插两口座转换成三口的插座");
	}
	
}
