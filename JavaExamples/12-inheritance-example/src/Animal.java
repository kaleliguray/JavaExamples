
public abstract class Animal {

	private int age;
	private String gender;
	private boolean mammal;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isMammal() {
		return mammal;
	}

	public void setMammal(boolean mammal) {
		this.mammal = mammal;
	}

	public abstract void mate();

}
