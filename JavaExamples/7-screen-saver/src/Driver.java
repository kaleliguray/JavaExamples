import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Driver {

	private static Random random = new Random();
	private static Rectangle[] rectangles = new Rectangle[50];
	private static Square[] squares = new Square[50];

	public static void main(String[] args) {
		for (int i = 0; i < rectangles.length; i++) {
			Rectangle rectangle = new Rectangle(random.nextInt(800), random.nextInt(600),
					Color.values()[random.nextInt(Color.values().length)]);
			rectangle.setWidth(random.nextInt(800 / 2));
			rectangle.setHeight(random.nextInt(600 / 2));
			rectangles[i] = rectangle;
		}

		for (int i = 0; i < squares.length; i++) {
			Square square = new Square(random.nextInt(800), random.nextInt(600),
					Color.values()[random.nextInt(Color.values().length)]);
			square.setLength(random.nextInt(800 / 2));
			squares[i] = square;
		}

		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		{
			JPanel panel = new JPanel() {
				@Override
				public void paint(Graphics g) {
					super.paint(g);

					Graphics2D graphics2d = (Graphics2D) g;
					for (int i = 0; i < rectangles.length; i++) {
						Rectangle rectangle = rectangles[i];
						rectangle.setPosX(random.nextInt(800));
						rectangle.setPosY(random.nextInt(600));

						rectangle.setWidth(random.nextInt(800 / 2));
						rectangle.setHeight(random.nextInt(600 / 2));
						rectangles[i].draw(graphics2d);
					}
					
					for (int i = 0; i < squares.length; i++) {
						Square square = squares[i];
						square.setPosX(random.nextInt(800));
						square.setPosY(random.nextInt(600));

						square.setLength(random.nextInt(800 / 2));
						squares[i].draw(graphics2d);
					}
				}
			};

			new Timer(1000, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					panel.repaint();
				}
			}).start();

			frame.add(panel, BorderLayout.CENTER);
		}
		frame.setVisible(true);
	}
}
