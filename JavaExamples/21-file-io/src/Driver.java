import java.io.File;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) {
		File file = new File("/Users/bora/Desktop/test.txt");

		System.out.println(file.exists());
		System.out.println(file.length());
		System.out.println(file.isFile());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		System.out.println(file.getAbsolutePath());
//		System.out.println(file.delete());
		if (Boolean.FALSE.equals(file.exists())) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
