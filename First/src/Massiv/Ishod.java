package Massiv;
//import java.util.Arrays;
public class Ishod {
	int[] numbers = {-9, 6, 0, 5, 40, 30, 7, -59};
	Sortir sort = new Sortir();  // ������� ������ �� ����� ����������
	public void Ishod(){
		//����� �������� �� ������� ���������
		System.out.println("������ �� ����������:");		
		for(int i = 0; i < numbers.length; i++){
			    System.out.println((i+1) + "-� ������� ������� = " +  numbers[i]);
			}
	sort.selectionSort(numbers); // ��������� ������ �������� � ��� �������� ������� numbers

	}
}
