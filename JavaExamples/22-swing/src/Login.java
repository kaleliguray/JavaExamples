import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login {

	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			JPanel panel = new JPanel();
			{
				JLabel label = new JLabel("Email:");
				panel.add(label);
				JTextField txtEmail = new JTextField(20);
				panel.add(txtEmail);
			}
			{
				JLabel label = new JLabel("Password:");
				panel.add(label);
				JTextField txtPassword = new JTextField(20);
				panel.add(txtPassword);
			}
			{
				JButton button = new JButton("Login");
				panel.add(button);
			}
			frame.add(panel);
		}
		frame.pack();
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}
}
