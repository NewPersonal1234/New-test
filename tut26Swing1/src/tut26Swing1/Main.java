package tut26Swing1;

import java.awt.FlowLayout;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {

	public static void main(String[] args) {
		Okno okno = new Okno();
		okno.setVisible(true);
		okno.setLayout(null);
		JScrollPane scrollPane = new JScrollPane(); // ������� ���� ������ ����
		scrollPane.setBounds(24, 11, 624, 239);   // ������� ���������� ��� ����� � ������ ����
		okno.add(scrollPane);  // �������� ���� � ��������
		JTextArea textArea = new JTextArea();
		textArea.setText("kdjkgdkjgdggdfdkjfkdjkfjdkjfkdjfkjdkfjkdjfkdfkdjkdfdfdfddffddfdfdfdfdfdfdfdfdfdfdfdht6jyjyjfjkdjfk");
		scrollPane.setViewportView(textArea);
	}

}
