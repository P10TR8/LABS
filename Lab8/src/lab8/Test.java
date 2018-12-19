package lab8;
import java.util.Scanner;
public class Test extends StudentInstytut{
	Scanner odczyt = new Scanner(System.in);
	String x;
public String CheckString(String x)
{
	while(x == "")
	{
		System.out.println("Brak parametru! Podaj parametr.");
		x=odczyt.next();
		this.x=x;	
		
	}
	return this.x;
}

public static void main(String[] args)
{
	Scanner odczyt = new Scanner(System.in);
	
	Test s1 = new Test();
	System.out.println("Podaj imie: ");
	String x = odczyt.next();
	s1.CheckString(x);
	System.out.println("x = "+x);
	
	s1.UstawImie(x);
	
	s1.UstawNazwisko("Nowak");
	s1.Ustaw_indeks(123);
	s1.Ustaw_wydzial("WiEA");
	s1.Ustaw_Instytut("Jakiœ instytut");
	s1.getInstytut();
	System.out.println(s1.getInstytut()+s1.getImie());
}
}