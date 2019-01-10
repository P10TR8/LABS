package lab9;
import java.time.LocalDate;
import java.util.Random;
public class zad2 extends Thread implements Runnable{
	Random r1=new Random();
	
	int x=r1.nextInt(29)+1990;
	int y=r1.nextInt(12)+1;
	int z=r1.nextInt(31)+1;
LocalDate data_glosowania =LocalDate.of(x, y, z);
int id_filmu;
int id_uzytkownika;
int ocena;
Random rand = new Random();
int l;
public zad2(int l)
{
	this.l=l;
}

public void run()
{
	
	while(true) {
		data_glosowania =LocalDate.of(x, y, z);
		this.x=rand.nextInt(29)+1990;
		this.y=rand.nextInt(12)+1;
		this.z=rand.nextInt(31)+1;
		this.id_filmu=rand.nextInt(101)+0;
		this.id_uzytkownika=rand.nextInt(2000)+0;
		this.ocena=rand.nextInt(10)+1;
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
	int size=0;
	int size1=1;
	zad2 z = new zad2(size);
	z.start();
	
	zad2 z2 = new zad2(size1);
	new Thread(z2).start();
	/*for(int i=0; i<size; i++)
	{
		Thread obj = new Thread(z);
		obj.start();
	}*/
	
	
}
}
