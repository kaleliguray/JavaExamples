
public class Driver {

	public static void main(String[] args) {
		Apple[] apples = {
				new Apple("Red", 100),
				new Apple("Red", 50),
				new Apple("Green", 80),
				new Apple("Yellow", 90),
				new Apple("Yellow", 60),
				new Apple("Red", 60),
				new Apple("Green", 110),
		};
		
//		filterApplesByColor(apples, "Green");
//		filterApplesByWeigth(apples, 50);
//		filterApplesByWeigthGte(apples, 100);
		
		filterApples(apples, new AppleComparator() {
			
			@Override
			public boolean test(Apple apple) {
				return apple.getWeigth() > 60 && apple.getColor().equals("Red");
			}
		});
		
		
	}
	
	public static void filterApples(Apple[] apples, AppleComparator comparator) {
		for (int i = 0; i < apples.length; i++) {
			if (comparator.test(apples[i])) {
				System.out.println(apples[i]);
			}
		}
	}
	
//	public static void filterApplesByColor(Apple[] apples, String color) {
//		for (int i = 0; i < apples.length; i++) {
//			if (apples[i].getColor().equals(color)) {
//				System.out.println(apples[i]);
//			}
//		}
//	}
//	
//	public static void filterApplesByDiffColor(Apple[] apples, String color) {
//		for (int i = 0; i < apples.length; i++) {
//			if (!apples[i].getColor().equals(color)) {
//				System.out.println(apples[i]);
//			}
//		}
//	}
//	
//	public static void filterApplesByWeigth(Apple[] apples, int weigth) {
//		for (int i = 0; i < apples.length; i++) {
//			if (apples[i].getWeigth() == weigth) {
//				System.out.println(apples[i]);
//			}
//		}
//	}
//	
//	public static void filterApplesByWeigthGte(Apple[] apples, int weigth) {
//		for (int i = 0; i < apples.length; i++) {
//			if (apples[i].getWeigth() >= weigth) {
//				System.out.println(apples[i]);
//			}
//		}
//	}
}
