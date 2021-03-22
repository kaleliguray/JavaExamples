import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.omg.CORBA.portable.ApplicationException;

public class Driver {

	public static void main(String[] args) {
		MouseMotionListener motionListener = new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println(e.getX() + " " + e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		JFrame frame = new JFrame("Button Listener");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			JPanel panel = new JPanel();
			panel.addMouseMotionListener(motionListener);
			JTextField textField = new JTextField(20);
			textField.addMouseMotionListener(motionListener);
			{
				textField.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						textField.setText(textField.getText().toUpperCase());
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				panel.add(textField);
			}
			{
				JButton button = new JButton("Click Me");
				button.addMouseMotionListener(motionListener);
				button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Button Clicked!");
						System.out.println("Hello, " + textField.getText());
					}
				});
				button.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						System.out.println("entered");
					}
				});
				panel.add(button);
			}
			frame.add(panel);
		}
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);

	}

}
