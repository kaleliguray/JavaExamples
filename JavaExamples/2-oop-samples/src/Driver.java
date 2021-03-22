public class Driver {

	public static void main(String[] args) {
		Employee employee = new Employee();
//		employee.setId(1);
		employee.setFirstName("JoHn");
		employee.setLastName("doe");
		employee.setSalary(1200);
		
		
		System.out.println(employee.getId());
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getSalary());
		
		
//		Calculator calculator;
//		calculator = new Calculator();
//
//		int total = calculator.plus(10, 20, 30);
//		System.out.println(total);
//
//		System.out.println(calculator.minus(20, 3));
//		
//		calculator.plus(1, 2);
	}
}
