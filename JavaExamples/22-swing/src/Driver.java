import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Driver {

	public static void main(String[] args) {
		// JButton button = Widgets.getInstance().button("Button 1");
		 
		Widgets widgets1 = Widgets.getInstance();
		Widgets widgets2 = Widgets.getInstance();
		
		
		System.out.println(widgets1 == widgets2);
		
//		System.out.println("App Started");
//		JFrame frame = new JFrame();
//		frame.setSize(800, 600);
//		frame.setTitle("Hello Swing");
//		frame.setLocationRelativeTo(null);
//		{
//			JPanel panel = new JPanel();
//			panel.setBorder(BorderFactory.createLineBorder(Color.RED));
//			{
//				JButton button = new JButton("Button");
//				panel.add(button);
//			}
//			{
//				JButton button = new JButton("Button");
//				panel.add(button);
//			}
//			{
//				JButton button = new JButton("Button");
//				panel.add(button);
//			}
//			{
//				JButton button = new JButton("Button");
//				panel.add(button);
//			}
//			{
//				JButton button = new JButton("Button");
//				panel.add(button);
//			}
//			frame.add(panel, BorderLayout.NORTH);
//		}
//		{
//			JPanel panel = new JPanel();
//			panel.setBorder(BorderFactory.createLineBorder(Color.RED));
//			{
//				JButton button = new JButton("Button");
//				panel.add(button);
//			}
//			{
//				JButton button = new JButton("Button");
//				panel.add(button);
//			}
//			frame.add(panel, BorderLayout.SOUTH);
//		}
//		{
//			JPanel panel = new JPanel();
//			panel.setBorder(BorderFactory.createLineBorder(Color.RED));
//			{
//				JButton button = new JButton("Button");
//				panel.add(button);
//			}
//			frame.add(panel, BorderLayout.WEST);
//		}
//		{
//			JPanel panel = new JPanel();
//			panel.setBorder(BorderFactory.createLineBorder(Color.RED));
//			{
//				JButton button = new JButton("Button");
//				panel.add(button);
//			}
//			frame.add(panel, BorderLayout.EAST);
//		}
//		{
//			JPanel panel = new JPanel();
//			panel.setBorder(BorderFactory.createLineBorder(Color.RED));
//
//			frame.add(panel, BorderLayout.CENTER);
//		}
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
//		System.out.println("App Finished");
	}

}
