package lessons15;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main extends JFrame implements Runnable{  //1. делаем JFrame, так там понядобится какойто интерфейс, Runnable - чтоб сделать поток 
	static private Socket connection;    // 2. инициализируем переменная для сокета(соединения)
	static private ObjectOutputStream output;   // 5. создаем поток для передачи
	static private ObjectInputStream input;     // 6. создаем поток для приема
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		new Thread(new Main("Test")).start();       // 16. для запуска потока run с полученными данными для передачи данных через сокет
		new Thread(new Server()).start();          // 17.запускаем тестовый сервер на другом классе
	}
	
	public Main(String name){    //  13. создаем конструктор визуализации
		super(name);
		setLayout(new FlowLayout());
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		
		final JTextField t1 = new JTextField(10);  //15. обявляется final для инициализации в коде только один раз
		final JButton b1 = new JButton("Send");
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==b1){
					sendData(t1.getText());
				}
			}
			
		});                            // 14. добавка слушателя не создавая отдельного класс
		add(t1);
		add(b1);
		
	}
	
	@Override
	public void run() {
		//System.out.println("1");   для проверки работы
		try {
			while(true){                                                        // 4. заключаем в бесконечный цикл, чтоб поток постоянно был открыт
				connection = new Socket(InetAddress.getByName("127.0.0.1"), 5678);  //3. определяем сокет - передаем интернет адрес и порт - каждая программа сидит на совем порту
				output = new ObjectOutputStream(connection.getOutputStream());   // 7. определяем отпут поток из созданного сокета
				input = new ObjectInputStream(connection.getInputStream());       // 8. определяем инпут поток из созданного сокета
				JOptionPane.showMessageDialog(null, (String)input.readObject());  // 9. активируется окошко когда из инпута можно будет что-то прочитать
			}
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		} catch (HeadlessException e) {
		} catch (ClassNotFoundException e) {
		}
		
	}
	
	private static void sendData(Object obj){     // 10. создаем метот через которые мы будем отправлять данные через созданный сокет
		try {
			output.flush();  // 11. выкинуть из потока все что было(очистка)
			output.writeObject(obj);   //12. этим методом мы будем записывать в поток наш объект;
		} catch (IOException e) {}
	}
}
