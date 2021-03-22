import java.util.HashSet;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		
		TreeSet<Employee> employees = new TreeSet<Employee>();
		employees.add(new Employee(4, "Emre", "CAN", 2200));
		employees.add(new Employee(2, "Emre", "MUTLU", 1200));
		employees.add(new Employee(3, "Emre", "SEVER", 3000));
		employees.add(new Employee(4, "Emre", "SEVER", 3000));
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
//		TreeSet<String> cars = new TreeSet<String>();
//		cars.add("Honda");
//		cars.add("Ford");
//		cars.add("Volvo");
//		cars.add("Renault");
//		cars.add("Toyota");
//		cars.add("GMC");
//		
//		for (String car : cars) {
//			System.out.println(car);
//		}
		
//		HashSet<String> cars = new HashSet<String>();
//		cars.add("Ford");
//		cars.add("Honda");
//		cars.add("Fiat");
//		cars.add("Volvo");
//		cars.add("Jeep");
//
//		for (String str : cars) {
//			System.out.println(str);
//		}
//
//		cars.remove("Ford");
//		System.out.println("-----------");
//
//		for (String a : cars) {
//			System.out.println(a);
//		}

//		Iterator<String> iterator = cars.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		cars.remove("Ford");
//		
//		System.out.println("---------------------");
//		
//		iterator = cars.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

//		HashSet<Integer> numbers = new HashSet<Integer>();
//		numbers.add(2);
//		numbers.add(3);
//		numbers.add(1);
//		numbers.remove(2);
//		numbers.add(2);
//		numbers.remove(1);
//		
//		Iterator<Integer> iterator = numbers.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
	}
}
