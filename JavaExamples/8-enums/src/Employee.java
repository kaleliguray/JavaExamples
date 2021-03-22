import java.time.DayOfWeek;

public class Employee {

	private String firstName;
	private String lastName;
	private Gender gender;
	private DayOfWeek offDay;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public DayOfWeek getOffDay() {
		return offDay;
	}

	public void setOffDay(DayOfWeek offDay) {
		this.offDay = offDay;
	}
}
