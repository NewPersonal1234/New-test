package GUI_calculyator;

import javax.swing.JFrame;

public class dick {

	public static void main(String args[]) {  //точка входа
		Reader r = new Reader("Калькулятор");  // создаем ссылку на класс (сверху название окна будет джигурда)
		r.setVisible(true);   //запускаем класс с передачей команды "теперь окно видимое"
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //запускаем класс с передачей команды "при нажатии крестика экран закрывается"
		r.setSize(250, 220);   // запускаем класс с передачей"размер окна"		
		r.setResizable(false);  //запускаем класс с передачей команды  "запрет изменения размера окна"
		r.setLocationRelativeTo(null);  // запускаем класс с передачей команды "располагает окно ровно в середине"
		
		
	}
	
}
