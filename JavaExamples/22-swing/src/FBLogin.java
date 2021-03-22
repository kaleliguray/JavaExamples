import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FBLogin {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Login");
		{
			JPanel centerPanel = new JPanel();
			BoxLayout boxLayout = new BoxLayout(centerPanel, BoxLayout.Y_AXIS);
			centerPanel.setLayout(boxLayout);
			{
				JPanel panel = new JPanel();
				{
					JLabel lblBanner = new JLabel("Facebook");
					lblBanner.setFont(lblBanner.getFont().deriveFont(Font.BOLD, 36));
					panel.add(lblBanner);
				}
				centerPanel.add(panel);
			}
			{
				JPanel panel = new JPanel();
				BoxLayout layout = new BoxLayout(panel, BoxLayout.X_AXIS);
				panel.setLayout(layout);
				{
					panel.add(new JLabel("Email"));
					panel.add(Box.createHorizontalGlue());
					panel.add(new JTextField(20));
				}
				centerPanel.add(panel);
			}
			{
				JPanel panel = new JPanel();
				BoxLayout layout = new BoxLayout(panel, BoxLayout.X_AXIS);
				panel.setLayout(layout);
				{
					panel.add(new JLabel("Password"));
					panel.add(Box.createHorizontalGlue());
					panel.add(new JPasswordField(20));
				}
				centerPanel.add(panel);
			}
			{
				JPanel panel = new JPanel();
				FlowLayout flowLayout = (FlowLayout) panel.getLayout();
				flowLayout.setAlignment(FlowLayout.RIGHT);
				{
					panel.add(new JButton("Cancel"));
					panel.add(new JButton("Login"));
				}
				centerPanel.add(panel);
			}
			frame.add(centerPanel);
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}


















