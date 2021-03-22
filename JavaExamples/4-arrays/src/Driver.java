import java.util.Random;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

//		int[] ints = new int[10];
//
//		ints[0] = 15;
//		ints[5] = 7;
//
//		for (int i = 0; i < ints.length; i++) {
//			System.out.print(ints[i] + " ");
//		}

		// 15 0 0 0 0 7 0 0 0 0

//		float[] floats = new float[100];
		Student[] students = new Student[10];
		
		students[0] = new Student("Ali", "CAN");

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println(students[i].toString());
			}
		}
		
		// 3 5 0 0 0 0

//		Random random = new Random();
//		int[] numbers = new int[6];
//		int iterationCount = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			iterationCount++;
//			int number = random.nextInt(49) + 1;
//			boolean isNumberExists = false;
//			for (int j = 0; j < numbers.length; j++) {
//				if (number == numbers[j]) {
//					isNumberExists = true;
//					break;
//				}
//			}
//			if (isNumberExists) {
//				i--;
//			} else {
//				numbers[i] = number;
//			}
//		}
//		
//		System.out.println("Iteration Count: " + iterationCount);
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Kaç sayı girilecek: ");
//		int count = scanner.nextInt();
//		int[] numbers = new int[count];
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print((i + 1) + ". Sayı: ");
//			numbers[i] = scanner.nextInt();
//		}
//		
//
//		int total = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			total += numbers[i];
//		}

//		System.out.println("Ortalama: " + ((float)total / count));

//		int[] numbers = new int[] { 1, 2, 3 };

//		int[] numbers = { 1, 2, 3 };
//		int[] numbers = new int[3];
//		numbers[0] = 1;
//		numbers[1] = 2;
//		numbers[2] = 3;

//		Object[] objects = new Object[5];
//		objects[0] = 1;
//		objects[1] = "ali";
//		objects[2] = 3.14;
//		objects[3] = new Student("ali", "can");
//		objects[4] = new int[3];
//		
//		
//		
//		Student student = (Student) objects[2];

//		String s = "3";
//		
//		String obj = s; // boxing
//		String a = (String) obj; // unboxing
//		
//		int i = (int)obj;

//		Object obj = "Ali";
//		
//		
//		obj = 2;
//		
//		obj = 2.2;
//		
//		obj = 3.14f;
//		
//		obj = new Student("", "");

//		String s = "3";
//		int i = Integer.parseInt(s);
//		String.valueOf(3); // "3"
//		System.out.println(s + 2);

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Öğrenci Sayısı: ");
//		int studentCount = Integer.parseInt(scanner.nextLine());
//		Student[] students = new Student[studentCount];
//		for (int i = 0; i < students.length; i++) {
//			System.out.println((i + 1) + "." + " Öğrenci");
//			System.out.print("Ad: ");
//			String firstName = scanner.nextLine();
//			System.out.print("Soyad: ");
//			String lastName = scanner.nextLine();
//			students[i] = new Student(firstName, lastName);
//		}
//
//		System.out.println("##### Öğrenciler #####");
//		for (int i = 0; i < students.length; i++) {
//			Student currentStudent = students[i];
//			System.out.println((i + 1) + "." + currentStudent.getFirstName() + " " + currentStudent.getLastName());
//		}

//		int[] numbers = new int[5];
//		numbers[0] = 10;
//		numbers[1] = 20;
//		numbers[2] = 30;
//		numbers[3] = 40;
//		numbers[4] = 50;
//
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//
//		float[] fs = new float[10];
//
//		Student[] students = new Student[3];
//		students[0] = new Student("Ali", "CAN");
//		students[1] = new Student("Veli", "BAN");
//		students[2] = new Student("Mehmet", "HAN");
//	
//		
//		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i]);
//		}
	}

}
