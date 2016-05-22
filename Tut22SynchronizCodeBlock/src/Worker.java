import java.util.ArrayList;
import java.util.Random;


public class Worker {
	private ArrayList<Integer> list1 = new ArrayList<Integer>();
	private ArrayList<Integer> list2 = new ArrayList<Integer>();
	private Random random = new Random();
	
	private void partOne(){  // ������� ������ � ��������� � ����1
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(random.nextInt(100));
	}
	
	private void partTwo(){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(random.nextInt(100));
	}
	
	private void proceed(){ // ������� 1000 �����
		for(int i=0;i<2000;i++){
			partOne();
			partTwo();
		}
	}
	
	public void start(){
		System.out.println("��������...");
		long startTime = System.currentTimeMillis();
		
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				proceed();
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				proceed();
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("����������� �����: "+(endTime-startTime)+"\n"
				+ "���� 1: "+list1.size()+"\n"
				+ "���� 2: "+list2.size());
		
	}
}
