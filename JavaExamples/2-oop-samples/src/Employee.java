
// access modifiers
// public
// protected
// default
// private

public class Employee {

	private int id = 8;
	private String firstName;
	private String lastName;
	private float salary;

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName.toUpperCase();
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName.toUpperCase();
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}
