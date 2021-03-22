import javax.swing.JButton;

/**
 * Singleton Design Pattern
 * 
 * @author bora
 *
 */
public final class Widgets {

	private static Widgets INSTANCE = null;

	private Widgets() {
	}

	public static Widgets getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Widgets();
		}
		return INSTANCE;
	}

	public JButton button(String label) {
		return new JButton(label);
	}
}
