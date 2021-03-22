import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyPictureBox extends JLabel {
	
	private String url;
	
	public MyPictureBox(String url) throws MalformedURLException {
		// download
		ImageIcon imageIcon = new ImageIcon(new URL(url));
		setIcon(imageIcon);
	}

}
