package example;
import java.util.Scanner;
public class zad4 {
	public static void main(String[] args) {
		Scanner odczyt = new Scanner(System.in); 
		int x = odczyt.nextInt();
		int srednia=0;
		int suma=0;
		int ilosc;
		int min, max;
		int[] tab= new int[x] ;
		for(int i=0; i<x; i++)
		{
			tab[i]=odczyt.nextInt();
			suma=suma+tab[i];
		}
		min=tab[0];
		max=tab[0];
		for(int j=0; j<x; j++)
		{
			if((j+1)<x) {
			if (min>tab[j+1])
			{
				min=tab[j+1];
			}
			
			if(max<tab[j+1])
			{
				max=tab[j+1];
			}
			}
		}
		srednia=suma/x;
		System.out.println("Liczba liczb "+x);
		System.out.println("Srednia z liczb "+srednia);
		System.out.println("Liczba minimalna "+min);
		System.out.println("Liczba maksymalna "+max);
	}
}
