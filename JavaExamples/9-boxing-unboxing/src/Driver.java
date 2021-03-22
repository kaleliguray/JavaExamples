import java.time.DayOfWeek;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
//		
//		Object object = null;
//		System.out.println(object);
//		
//		
//		object = "ali";
//		System.out.println(object);
//		System.out.println(object.getClass().getName());
//		
//		object = "veli";
//		System.out.println(object);
//		System.out.println(object.getClass().getName());
//		
//		object = 2;
//		System.out.println(object);
//		System.out.println(object.getClass().getName());
//		
//		object = 3.14;
//		System.out.println(object);
//		System.out.println(object.getClass().getName());
//		
//		object = new Random();
//		System.out.println(object);
//		System.out.println(object.getClass().getName());

		Object object = 12; // boxing

		int x = (int) object; // unboxing
		
		test(3);
		test("ali");
//		test(new Random());
//		test(DayOfWeek.FRIDAY);
	}
	
	public static void test(Object object) {
		int other = (int) object;
		System.out.println(other * 2);
	}

}
