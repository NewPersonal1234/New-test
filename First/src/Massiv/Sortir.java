package Massiv;

public class Sortir {
	Vivod viv = new Vivod();  // создаем ссылку на класс вывода
	public void selectionSort (int[] numbers){  // запускаем сортировку с заранее принятыми значениями массива numbers
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
	    viv.Vivod(numbers); // запускаем сслыку на класс вывода со значениями измененного массива numbers
		}
	
}
