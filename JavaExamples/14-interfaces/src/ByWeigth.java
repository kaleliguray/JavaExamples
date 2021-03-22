
public class ByWeigth implements AppleComparator{

	@Override
	public boolean test(Apple apple) {
		return apple.getWeigth() >= 50;
	}

}
