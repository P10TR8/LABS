package lab3;
import java.util.Scanner;
public class zad2 {
	
		public static void main(String[] args)
		{
			Scanner odczyt = new Scanner(System.in);
			int x = odczyt.nextInt();;
			System.out.println("Dzielniki liczby "+ x +" :");	
			for(int i=1; i<=x; i++)
			{
				if(x%i==0)
				{
						System.out.print(i+", ");
				}
			}
		}
	}
