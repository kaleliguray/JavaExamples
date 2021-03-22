
public class Driver {

	public static void main(String[] args) {
		String a = "ahmet";
		String b = "ahmet";
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		String c = new String("ali");
		String d = new String("ali");
		
		System.out.println(c==d);
		System.out.println(c.equals(d));
		
		
//		String a = "ali";
//		String b = "ali";
		
		b = "mehmet";
		
//		
//		System.out.println(a.equals(b));
	}
	
}
