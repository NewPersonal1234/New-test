package lessons15;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class Server implements Runnable{
	static private ServerSocket server;   // 18. �������������� ��������� ����� ��� �������
	static private Socket connection;    // 2. �������������� ���������� ��� ������(����������)
	static private ObjectOutputStream output;   // 5. ������� ����� ��� ��������
	static private ObjectInputStream input;     // 6. ������� ����� ��� ������

	@Override
	public void run() {
		try {
			server = new ServerSocket(5678, 10);  //20. �������� ������� ��������� ��� ������������ ������ � ���-�� ������������ ����������� 
			while(true){                                                        // 4. ��������� � ����������� ����, ���� ����� ��������� ��� ������
				connection = server.accept();  // 19. ������� ���������� �����
				output = new ObjectOutputStream(connection.getOutputStream());   // 7. ���������� ����� ����� �� ���������� ������
				input = new ObjectInputStream(connection.getInputStream());       // 8. ���������� ����� ����� �� ���������� ������
				output.writeObject("�� ��������: "+(String)input.readObject());
			}
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		} catch (HeadlessException e) {
		} catch (ClassNotFoundException e) {
		}
		
	}

}
