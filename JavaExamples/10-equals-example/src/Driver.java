
public class Driver {

	public static void main(String[] args) {
		Player playerA = new Player(1);
		Player playerB = new Player(1);
		
		System.out.println(playerA);
		System.out.println(playerB);
		
		System.out.println(playerA == playerB);
		System.out.println(playerA.equals(playerB));
	}
}
