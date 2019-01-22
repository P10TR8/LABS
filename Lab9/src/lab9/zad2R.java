package lab9;

import java.time.LocalDate;
import java.util.Random;

public class zad2R implements Runnable {
	
	void Set_id_filmu(int id_filmu)
	{
		this.id_filmu=id_filmu;
	}
	void Set_id_uzytkownika(int id_uzytkownika)
	{
		this.id_uzytkownika=id_uzytkownika;
	}
	void Set_ocena(int ocena)
	{
		this.ocena=ocena;
	}
	void Set_data(int x, int y, int z)
	{
		x=rand.nextInt(29)+1990;
		y=rand.nextInt(12)+1;
		z=rand.nextInt(28)+1;
		this.data_glosowania=LocalDate.of(x, y, z);
	}
	int Get_id_filmu()
	{
		return this.id_filmu;
	}
	int Get_id_uzytkownika()
	{
		return this.id_uzytkownika;
	}
	int Get_ocena()
	{
		return this.ocena;
	}
	LocalDate get_data()
	{
		return this.data_glosowania;
	}
	int l;
	zad2R(int l)
	{
		this.l=l;
	}
LocalDate data_glosowania;
int id_filmu;
int id_uzytkownika;
int ocena;
Random rand = new Random();
public void run()
{
	
	while(true) {
		
		System.out.println("Id filmu: "+this.id_filmu+", Id uzytkownika: "+this.id_uzytkownika+", ocena:"+this.ocena+", data_glosowania:"+this.data_glosowania);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
}
}
zad2R(){
	Random rand = new Random();
	this.Set_id_filmu(rand.nextInt(101)+0);
	this.Set_id_uzytkownika(rand.nextInt(2000)+0);
	this.Set_ocena(rand.nextInt(10)+1);
	this.Set_data(1, 1, 1);
	Thread thread = new Thread(this);
    thread.start();
	
}

}