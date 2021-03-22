import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Driver {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(3029);
		System.out.println("Waiting for connection...");
		Socket socket = serverSocket.accept();
		System.out.println("Incoming connection");

		InputStream inputStream = socket.getInputStream();
		int c = 0;
		while ((c = inputStream.read()) != -1) {
			System.out.print((char) c);
		}

//		OutputStream outputStream = socket.getOutputStream();
//		outputStream.write("Selam naber".getBytes());
//		outputStream.flush();
//		outputStream.close();
//		socket.close();
//		serverSocket.close();
	}
}
