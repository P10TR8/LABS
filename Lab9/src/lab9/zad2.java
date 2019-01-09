package dziewiec;

import java.time.LocalDate;

public class zad2 extends Thread{
	LocalDate data_glosowania =LocalDate.now();
	int id_filmu;
	int id_uzytkownika;
	int ocena;
	
	public void setIf_filmu(int id_filmu)
	{
		this.id_filmu=id_filmu;
	}
	public void setId_uzytkownika(int id_uzytkownika)
	{
		this.id_uzytkownika=id_uzytkownika;
	}
	public void setOcena(int ocena)
	{
		this.ocena=ocena;
	}
	public void setData_glosowania(LocalDate data_glosowania)
	{
		this.data_glosowania=data_glosowania;
	}
	public void run()
	{
		
		while(true) {
			System.out.println("Id filmu: "+this.id_filmu+", Id uzytkownika: "+this.id_uzytkownika+", ocena:"+this.ocena+", data_glosowania:"+this.data_glosowania);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	}
	public static void main(String[] args)
	{
		int size=15;
		/*Thread[] threads = new Thread[size];
		for(int i=0; i<size; i++)
		{
			threads[i] = new zad1(i);
		}
		for(int i=0; i<size; i++)
		{
			threads[i].start();
		}*/
		
		for(int i=0; i<10; i++)
		{
			Thread obj = new Thread(new zad2());
			obj.start();
		}
		
		//threads[i] = new zad1();
	}

}