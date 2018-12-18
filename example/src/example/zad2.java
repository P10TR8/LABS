package example;
import java.util.Scanner;
import static java.lang.Math.*;
public class zad2 {
	public static void main(String[] args) {
		Scanner odczyt = new Scanner(System.in); 
		double a = odczyt.nextDouble();
		double b = odczyt.nextDouble();
		double c = odczyt.nextDouble();
		double x1, x2;
		double dd;
		double d;
		dd=pow(b,2)-4*a*c;
		d=sqrt(dd);
		if(d<0)
		{
		System.out.println("Delta ujemna, uk³ad nie do rozwi¹zania w zbiorze liczb rzeczywistych");	
		}
		else if(d==0)
		{
			x1=(-1*b)/2*a;
			System.out.format("x1= "+"%.2f%n", x1);
		}
		else
		{
		x1=((-1*b)-d)/2*a;
		x2=((-1*b)+d)/2*a;
		System.out.format("x1= "+"%.2f%n", x1);
		System.out.format("x2= "+"%.2f%n", x2);
		}
		
	}
}
