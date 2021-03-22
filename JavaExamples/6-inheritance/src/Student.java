public class Student {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return this.id == other.id;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name;
	}
}