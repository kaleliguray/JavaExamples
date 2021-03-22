
public class Player {

	private int id;

	public Player(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		Player other = (Player) obj;
		return other.id == this.id;
	}
}
