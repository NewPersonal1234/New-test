package formatter;

import java.util.Formatter;
import java.util.Scanner;

public class dick {

	static Formatter x;
	static Scanner scn;
	
	public static void main(String[] args) {
		try{
			x = new Formatter("res//1.txt");  //formatter если не находит файл, то создает новый - быстрый способ создания файла
			scn = new Scanner(System.in);
			System.out.println("сколько вам лет?");
			int a = (int)Double.parseDouble(scn.next());  //кастование double-цивры с точкой(2.2)
			System.out.println("Как вас зовут?");
			String b = scn.next();
			System.out.println("Где вы живете?");
			String c = scn.next();
			x.format("Меня зовут %s, мне %d лет, я живу в городе %s", b, a, c);
			x.close();  //закрываем буфер памяти, чтоб не занимать место
		}catch(Exception e){};

	}

}
