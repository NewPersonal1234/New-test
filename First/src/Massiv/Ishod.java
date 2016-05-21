package Massiv;
//import java.util.Arrays;
public class Ishod {
	int[] numbers = {-9, 6, 0, 5, 40, 30, 7, -59};
	Sortir sort = new Sortir();  // создаем ссылку на класс сортировки
	public void Ishod(){
		//вывод значений на консоль начальные
		System.out.println("Массив до сортировки:");		
		for(int i = 0; i < numbers.length; i++){
			    System.out.println((i+1) + "-й элемент массива = " +  numbers[i]);
			}
	sort.selectionSort(numbers); // запускаем ссылку добавляя в нее значения массива numbers

	}
}
