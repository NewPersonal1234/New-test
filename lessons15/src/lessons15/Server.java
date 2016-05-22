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
	static private ServerSocket server;   // 18. инициализируем отдельный сокет для сервера
	static private Socket connection;    // 2. инициализируем переменная для сокета(соединения)
	static private ObjectOutputStream output;   // 5. создаем поток для передачи
	static private ObjectInputStream input;     // 6. создаем поток для приема

	@Override
	public void run() {
		try {
			server = new ServerSocket(5678, 10);  //20. отдельно создаем параметры для серверсокета №порта и кол-во максимальных подключений 
			while(true){                                                        // 4. заключаем в бесконечный цикл, чтоб поток постоянно был открыт
				connection = server.accept();  // 19. команда возвращает сокет
				output = new ObjectOutputStream(connection.getOutputStream());   // 7. определяем отпут поток из созданного сокета
				input = new ObjectInputStream(connection.getInputStream());       // 8. определяем инпут поток из созданного сокета
				output.writeObject("Вы прислали: "+(String)input.readObject());
			}
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		} catch (HeadlessException e) {
		} catch (ClassNotFoundException e) {
		}
		
	}

}
