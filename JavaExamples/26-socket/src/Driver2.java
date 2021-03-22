import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Driver2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("10.3.51.166", 3029);
		InputStream inputStream = socket.getInputStream();
		int c = 0;
		while ((c = inputStream.read()) != -1) {
			System.out.print((char) c);
		}
		inputStream.close();
		socket.close();
	}
}
