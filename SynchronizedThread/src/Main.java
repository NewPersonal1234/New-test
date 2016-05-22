
public class Main {
	private static int number;

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Worker());
		Thread t2 = new Thread(new Worker());
		
		t1.start();
		t2.start();
		
		try {
			t1.join();          // медтод для ожидания завершения выполнения потока
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(number);
		

	}

	public static synchronized void increceNumber(){  //synchronized заставляет потоко работать по очереди
		number++;
	}
}
