package lab3;
import java.util.Scanner;
import java.util.Random;
public class zad3 {
	static public void main(String[] args)
	{
		Scanner odczyt = new Scanner(System.in);
		int x;
		Random rand = new Random();
		int y = rand.nextInt(200)+1;
		//System.out.println("y= "+y);
		do
		{
			System.out.println("Podaj liczbe:");
			x = odczyt.nextInt();
			if(x>y)
			{
			System.out.println("Twoja liczba jest wieksza od wyniku:");
			}
			else if(x<y)
			{
			System.out.println("Twoja liczba jest mniejsza od wyniku:");
			}
		}
		while(x!=y);
		
		System.out.println("Brawo, zgad³eœ!");
	}
}
