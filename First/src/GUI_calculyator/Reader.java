package GUI_calculyator;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame{   // создаем класс с наследованием команд из библиотеки пакета JFrame - графика
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b_min, b_plus, b_umnog, b_delen, b_ravn, b_c;               // инициализируем 2 кнопки
	JLabel l1, l2;
	JLabel l3;
	//JTextField t1, t2;
	int i, chislo, znak, predid;
	int k = 0;
	int j = 0;
	String a = "";   //вводима€ цифра
	String b = "";  // отрезок текста с предыдущю операции
	String c = "";  //число дл€ операций
	String v = "";  // текст на экран
	String rez = "";  // ответ
	eHandler handler = new eHandler();
	
	public Reader(String s){   // конструктор
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("  1  "); b2 = new JButton("  2  "); b3 = new JButton("  3  "); b4 = new JButton("  4  "); b5 = new JButton("  5  ");
		b6 = new JButton("  6  "); b7 = new JButton("  7  "); b8 = new JButton("  8  "); b9 = new JButton("  9  "); b0 = new JButton("  0  ");
		b_min = new JButton("  -  "); b_plus = new JButton("  +  "); b_umnog = new JButton("  *  "); b_delen = new JButton("  /  ");
		b_ravn = new JButton("  =  "); b_c = new JButton("  C  ");
		l1 = new JLabel("окно вывода: ");  l2 = new JLabel("");
		l3 = new JLabel("");
    //  l1.setSize(30, 40);		
	//	l2 = new JLabel("¬введите второе число:");
	//	l3 = new JLabel("");
	//	l4 = new JLabel("");
	//  t1 = new JTextField(20);  //пространство на 10 символов ввода
	//	t2 = new JTextField(10);
		    
		add(b7);    add(b8);    add(b9);    add(b_delen);
		add(b4);    add(b5);    add(b6);    add(b_umnog);
		add(b1);    add(b2);    add(b3);    add(b_min);
		add(b0);    add(b_plus);    add(b_ravn);    add(b_c);
		add(l1);    add(l2);    add(l3);
		
		b1.addActionListener(handler);   b2.addActionListener(handler);   b3.addActionListener(handler);
		b4.addActionListener(handler);   b5.addActionListener(handler);   b6.addActionListener(handler);
		b7.addActionListener(handler);   b8.addActionListener(handler);   b9.addActionListener(handler);
		b0.addActionListener(handler);   b_delen.addActionListener(handler);   b_umnog.addActionListener(handler);
		b_min.addActionListener(handler);   b_plus.addActionListener(handler);  b_c.addActionListener(handler);
		b_ravn.addActionListener(handler);
		
	}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b_c){
				i = 0; k = 0; j = 0; a = (""); b = (""); c = (""); l2.setText(c);	
			}
				if(e.getSource()==b1){
					i = 1;
					String a = String.valueOf(i);
					v = b + c + a;
					c = c + a;
					l2.setText(v);
					//int k = Integer.parseInt(c);
				}
				if(e.getSource()==b2){
					i = 2;
					String a = Integer.toString(i);
					//if (k==0) {b = "";}
					//else {String b = Integer.toString(k);}
					v = b + c + a;
					c = c + a;
					l2.setText(v);
					//int k = Integer.parseInt(c);
				}
				if(e.getSource()==b3){
					i = 3;
					String a = Integer.toString(i);
					v = b + c + a;
					c = c + a;
					l2.setText(v);
				}
				if(e.getSource()==b4){
					i = 4;
					String a = Integer.toString(i);
					v = b + c + a;
					c = c + a;
					l2.setText(v);
				}
				if(e.getSource()==b5){
					i = 5;
					String a = Integer.toString(i);
					v = b + c + a;
					c = c + a;
					l2.setText(v);
				}
				if(e.getSource()==b6){
					i = 6;
					String a = Integer.toString(i);
					v = b + c + a;
					c = c + a;
					l2.setText(v);
				}
				if(e.getSource()==b7){
					i = 7;
					String a = Integer.toString(i);
					v = b + c + a;
					c = c + a;
					l2.setText(v);
				}
				if(e.getSource()==b8){
					i = 8;
					String a = Integer.toString(i);
					v = b + c + a;
					c = c + a;
					l2.setText(v);
				}
				if(e.getSource()==b9){
					i = 9;
					String a = Integer.toString(i);
					v = b + c + a;
					c = c + a;
					l2.setText(v);
				}
				if(e.getSource()==b0){
					i = 0;
					int k = Integer.parseInt(c);
					if (k!=0){
						String a = Integer.toString(i);
						v =  b + c + a;
						c = c + a;
						l2.setText(v);
					}
				}
				if(e.getSource()==b_plus){
					Integer chislo = Integer.valueOf(c);
					int znak = 1;
					b = c + "+";
					c = ("");
					l2.setText(b);

				}
				if(e.getSource()==b_min){
					int chislo = Integer.parseInt(c);
					int znak = 2;
					b = c + "-";
					c = ("");
					l2.setText(b);	
				}
				if(e.getSource()==b_umnog){
					int chislo = Integer.parseInt(c);
					int znak = 3;
					b = c + "*";
					c = ("");
					l2.setText(b);
				}
				if(e.getSource()==b_delen){
					int chislo = Integer.parseInt(c);
					int znak = 4;
					b = c + "/";
					c = ("");
					l2.setText(b);	
				}
				if(e.getSource()==b_ravn){
					Integer predid = Integer.valueOf(c);
					if(znak==1) {
						chislo = chislo + predid;}
					if(znak==2) {
						chislo = chislo - predid;}
					if(znak==3) {
						chislo = chislo * predid;}
					if(znak==4) {
						chislo = chislo / predid;}
					String rez = String.valueOf(chislo);
					v = v + "=" + rez;
					l2.setText(v);	
				}
				
				
				//j++;
				//if (j==9) {break;}
			//}
			//while (e.getSource()!=b_ravn); 
			}
		
		
	}
}
