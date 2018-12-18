package example;
import java.util.Scanner;
public class zad5 {
	public static void main(String[] args)
	{
		Scanner odczyt = new Scanner(System.in);
		double a = odczyt.nextDouble();
		char x = odczyt.next().charAt(0); //pobranie 1 znaku
		double b = odczyt.nextDouble();
		double c;
		
		
		switch(x)
		{
		case '+':
			c=a+b;
			System.out.println(a +" + "+b+" = "+c);
			break;
		case '-':
			c=a-b;
			System.out.println(a +" - "+b+" = "+c);
			break;
		case '*':
			c=a*b;
			System.out.println(a +" * "+b+" = "+c);
			break;
		case '/':
			if(b>0)
			{
				c=a/b;
				System.out.println(a +" / "+b+" = "+c);
				break;
			}
			else
				System.out.println("Blad, dzielenie przez zero");
				break;
		default: break;
		}
		
		
	}

}
