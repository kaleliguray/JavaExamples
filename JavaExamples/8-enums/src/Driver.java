import java.time.DayOfWeek;

public class Driver {

	public static void main(String[] args) {
		
		
		
		Employee employee = new Employee();
		employee.setFirstName("Ali");
		employee.setLastName("CAN");
		employee.setGender(Gender.MALE);
		
		employee.setOffDay(DayOfWeek.values()[2]);
		
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getGender());
		
		System.out.println("-------------------------");
		Gender[] values = Gender.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		System.out.println("-------------------------");
		System.out.println(Gender.OTHER.ordinal());
		
		Gender gender = Gender.valueOf("FEMALE");
		System.out.println(gender);
	}
	
}
