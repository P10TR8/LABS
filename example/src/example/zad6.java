package example;
import java.util.Scanner;
import static java.lang.Math.*;
public class zad6 {
	public static void main(String[] args)
	{
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Wartosc przedmiotu: ");
		double kwota = odczyt.nextDouble();
		System.out.println("Wplata wlasna: ");
		double wpl = odczyt.nextDouble();
		System.out.println("Liczba rat: ");
		int raty = odczyt.nextInt();
		while(kwota>300000)
		{
			System.out.println("B³¹d, wartosc przedmiotu: ");
			kwota = odczyt.nextDouble();
		}
		while(raty>96 || raty<=0)
		{
			System.out.println("B³¹d, liczba rat: ");
			raty = odczyt.nextInt();
		}
		kwota=kwota-wpl;
		double ratalisingu;
		double w;
		
		if(raty>0 && raty<=24)
		{
			w=1+0.02;
			ratalisingu=(kwota*w)/(raty);
			System.out.format("Raty: "+"%.2f%n", ratalisingu);
		}
		else if (raty<=48 && raty>24)
		{
			w=1+0.03;
			
			ratalisingu=(kwota*w)/(raty);
			System.out.format("Raty: "+"%.2f%n", ratalisingu);
		}
		else if (raty<=60 && raty>48)
		{
			w=1+0.04;
			ratalisingu=(kwota*w)/(raty);
			System.out.format("Raty: "+"%.2f%n", ratalisingu);
		}
		else if (raty<=72 && raty>60)
		{
			w=1+0.05;
			ratalisingu=(kwota*w)/(raty);
			System.out.format("Raty: "+"%.2f%n", ratalisingu);
		}
		else if (raty<=96 && raty>72)
		{
			w=1+0.06;
			ratalisingu=(kwota*w)/(raty);
			System.out.format("Raty: "+"%.2f%n", ratalisingu);
		}
		else;
	}
	}