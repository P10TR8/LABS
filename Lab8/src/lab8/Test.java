package lab8;
import java.util.Scanner;
import java.util.regex.*;

public class Test {
public static void main(String[] args)
{
	StudentInstytut s1 = new StudentInstytut();
	Scanner odczyt = new Scanner(System.in);
	System.out.println("Podaj imie: ");
	String imie=odczyt.next();
	Pattern pattern = Pattern.compile("\\D");
	Matcher matcher=pattern.matcher(imie);
	while(matcher.find()==false)
	{
		System.out.println("Blad, wprowadz popprawne dane: ");
		imie=odczyt.next();
		matcher=pattern.matcher(imie);

	}
	System.out.println("Podaj nazwisko: ");
	String nazwisko=odczyt.next();
	matcher=pattern.matcher(nazwisko);
	while(matcher.find()==false)
	{
		System.out.println("Blad, wprowadz popprawne dane: ");
		nazwisko=odczyt.next();
		matcher=pattern.matcher(nazwisko);

	}
	System.out.println("Podaj wydzial: ");
	String wydzial=odczyt.next();
	matcher=pattern.matcher(wydzial);
	while(matcher.find()==false)
	{
		System.out.println("Blad, wprowadz popprawne dane: ");
		wydzial=odczyt.next();
		matcher=pattern.matcher(wydzial);

	}
	System.out.println("Podaj instytut: ");
	String instytut=odczyt.next();
	matcher=pattern.matcher(instytut);
	while(matcher.find()==false)
	{
		System.out.println("Blad, wprowadz popprawne dane: ");
		instytut=odczyt.next();
		matcher=pattern.matcher(instytut);

	}
	
	pattern = Pattern.compile("\\d");
	System.out.println("Podaj pesel: ");
	String pesel=odczyt.next();
	matcher=pattern.matcher(pesel);
	while(matcher.find()==false)
	{
		System.out.println("Blad, wprowadz popprawne dane: ");
		pesel=odczyt.next();
		matcher=pattern.matcher(pesel);

	}
	int pese=Integer.parseInt(pesel);
	
	
	s1.UstawImie(imie);
	s1.UstawNazwisko(nazwisko);
	s1.Ustaw_pesel(pese);
	s1.Ustaw_wydzial(wydzial);
	s1.Ustaw_Instytut(instytut);
	s1.getInstytut();
	System.out.println(s1.getInstytut()+" "+s1.getImie());
}
}
