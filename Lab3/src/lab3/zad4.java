package lab3;
import java.util.Scanner;
public class zad4 {
	static public void main(String[] args)
	{
		Scanner odczyt = new Scanner(System.in);
		int x;
		int l=1;
		int k=1;
		do
		{
			System.out.println("Podaj x, 5 konczy dzialanie programu: ");
			x = odczyt.nextInt();
			l=l*x;
		}
		while(x!=5);
		l=l/5;
		System.out.println("Iloczyn wprowadzonych liczb: "+l);
	}

}
