package Thread_potoki;

import java.util.*;

class pussy implements Runnable{
	
	int time;  // время, которое поток спит
	String name;
	Random r = new Random();
	
	
	public pussy(String name){
		this.name = name;  // назначение переменной в конструкторе на переменную в классе
		time = r.nextInt(999);  //создаем рандомное число времени в диапазоне от 0 до 999
		
	}
	
	public void run(){
		System.out.printf("поток %s спит %d\n", name, time);  // показываем какой поток и сколько будет спать
		try{                   // создаем сон
			Thread.sleep(time);
		}catch(Exception e){}
		System.out.printf("поток %s проснулся и закончился\n", name);
	}
}
