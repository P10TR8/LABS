package lab3;
import java.util.Scanner;
import static java.lang.Math.*;
public class zad5 {
	static public void main(String[] args)
	{
		
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj calkowita nieujemna liczbe:");
		int x = odczyt.nextInt();
		int t = 3;
		int potega=1;
		while(potega<=x)
		{
			System.out.println("wartosc: "+potega);
			potega*=t;
			
		}
				
	}
	
}
