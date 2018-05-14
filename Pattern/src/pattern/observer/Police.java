package pattern.observer;

public class Police implements IUndercover {

	@Override
	public void watchBadMan(String badThings) {
		System.out.println("告诉警局坏人干的坏事:"+badThings);
	}

}
