package Massiv;

public class Sortir {
	Vivod viv = new Vivod();  // ������� ������ �� ����� ������
	public void selectionSort (int[] numbers){  // ��������� ���������� � ������� ��������� ���������� ������� numbers
	    for (int i = 0; i < numbers.length; i++) {
	        int min = numbers[i];
	        int min_i = i; 
	        for (int j = i+1; j < numbers.length; j++) {
	            if (numbers[j] < min) {
	                min = numbers[j];
	                min_i = j;
	            }
	        }
	            if (i != min_i) {    
	            int tmp = numbers[i];
	            numbers[i] = numbers[min_i];
	            numbers[min_i] = tmp;
	            } 	 		
	    	}
	    viv.Vivod(numbers); // ��������� ������ �� ����� ������ �� ���������� ����������� ������� numbers
		}
	
}
