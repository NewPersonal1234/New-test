package GUI_calculyator;

import javax.swing.JFrame;

public class dick {

	public static void main(String args[]) {  //����� �����
		Reader r = new Reader("�����������");  // ������� ������ �� ����� (������ �������� ���� ����� ��������)
		r.setVisible(true);   //��������� ����� � ��������� ������� "������ ���� �������"
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //��������� ����� � ��������� ������� "��� ������� �������� ����� �����������"
		r.setSize(250, 220);   // ��������� ����� � ���������"������ ����"		
		r.setResizable(false);  //��������� ����� � ��������� �������  "������ ��������� ������� ����"
		r.setLocationRelativeTo(null);  // ��������� ����� � ��������� ������� "����������� ���� ����� � ��������"
		
		
	}
	
}
