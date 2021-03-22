
public class Player {

	private String nickname;
	
	private static int count = 0;
	
	public Player() {
		this.count++;
	}
	
	public Player(String nickname) {
		this.nickname = nickname;
		this.count++;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public int getCount() {
		return count;
	}
}
