import java.util.ArrayList;
import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, "Ali", "CAN", 2200));
		employees.add(new Employee(2, "Ahmet", "MUTLU", 1200));
		employees.add(new Employee(3, "Emre", "SEVER", 3000));

//		for (int i = 0; i < employees.size(); i++) {
//			System.out.println(employees.get(i));
//		}
		
		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			System.out.println(employee);
			
			
		}

//		ArrayList<Object> arrayList = new ArrayList<Object>();
//		arrayList.add(1);
//		arrayList.add("Ali");
//		arrayList.add(12.3);
//		arrayList.add(null);
//		arrayList.add(true);
//		
//		
//		boolean b = (boolean) arrayList.get(2);

//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(1);
//		numbers.add(3);
//
//		numbers.add(1, 5);
//
//		System.out.println(numbers);
//
//		numbers.remove(2);
//
//		System.out.println(numbers);
//
//		int index = numbers.indexOf(15);
//		System.out.println(index);
//		
//		numbers.add(1);
//		numbers.add(1);
//		
//		System.out.println(numbers);

	}
}
