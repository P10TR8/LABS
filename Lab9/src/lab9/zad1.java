package lab9;

import java.time.LocalDate;

public class zad1 extends Thread{
	LocalDate now =LocalDate.now();
	
	int id;
	public zad1(int id)
	{
		this.id=id;
	}
	public void run()
	{
		
		while(true) {
			System.out.println("thread: "+id+", date: "+now);
			try {
				//usypiamy w¹tek na 100 milisekund
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	}
	public static void main(String[] args)
	{
		int size=15;
		Thread[] threads = new Thread[size];
		for(int i=0; i<size; i++)
		{
			threads[i] = new zad1(i);
		}
		for(int i=0; i<size; i++)
		{
			threads[i].start();
		}
		
		//threads[i] = new zad1();
	}

}