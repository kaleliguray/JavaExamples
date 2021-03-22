
public class ByColor implements AppleComparator{

	@Override
	public boolean test(Apple apple) {
		return apple.getColor().equals("Red");
	}

}
