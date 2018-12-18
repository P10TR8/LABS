package lab6;
import java.util.Scanner;
//zadanie1
public class kalkulator {
	int x, y, z, a, b, c, d;
	public kalkulator(int x)
	{
		this.x=x;
	}
	public kalkulator(int x, int y, int z, int a)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		this.a=a;
	}
	public kalkulator(int x, int y, int z, int a, int b, int c, int d)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	static void wybor()
	{
		System.out.println("Wybierz 1 - konstruktor 1 parametrowy, 2 - konstruktor 4 parametrowy, 3 konstruktor 7 parametrowy");
	}
	static void wybor1()
	{
		System.out.println("Wybierz dzia³anie: 1:+, 2:-, 3:*, 4:/");
	}
	void licz(int a)
	{
		int r=a*a;
		this.x=a*a;
		System.out.println(r);
		
	}
	void licz(int a, int b, int c, int d, int o)
	{
		int r=0;
		switch(o)
		{
		case 1:
		{
			r=a+b+c+d;
		}
		break;
		case 2:
		{
			r=a-b-c-d;
		}
		break;
		case 3:
		{
			r=a*b*c*d;
		}
		break;
		case 4:
		{
			r=a/b/c/d;
		}
		break;
		default:
			System.out.println("B³¹d");
		break;
		}
		System.out.println(r);
		
	}
	void licz(int a, int b, int c, int d, int e, int f, int g, int o)
	{
		int r=0;
		switch(o)
		{
		case 1:
		{
			r=a+b+c+d+e+f+g;
		}
		break;
		case 2:
		{
			r=a-b-c-d-e-f-g;
		}
		break;
		case 3:
		{
			r=a*b*c*d*e*f*g;
		}
		break;
		case 4:
		{
			r=a/b/c/d/e/f/g;
		}
		break;
		default:
			System.out.println("B³¹d");
		break;
		}
		System.out.println(r);
		
	}
	kalkulator(kalkulator v, int e)
	{
		switch(e)
		{
		case 1:
		{
			x=v.x;
			System.out.println("Wykorzystana liczba: "+x);
		}
		break;
		case 2:
		{
			x=v.x;
			y=v.y;
			z=v.z;
			a=v.a;
			System.out.println("Wykorzystane liczby: "+x+" "+y+" "+z+" "+a);
		}
		break;
		case 3:
		{
			x=v.x;
			y=v.y;
			z=v.z;
			a=v.a;
			b=v.b;
			c=v.c;
			d=v.d;
			System.out.println("Wykorzystane liczby: "+x+" "+y+" "+z+" "+a+" "+b+" "+c+" "+d);
		}
		break;
		default:
			break;
		}
		
		
	}
	public static void main(String[] args)
	{
		kalkulator p;
		int x, y, z, d, e, f, g, h, i, j, k, l, q;
		wybor();
		Scanner odczyt = new Scanner(System.in);
		int w=odczyt.nextInt();
		switch(w)
		{
		case 1:
		{
		System.out.println("Podaj parametr");
		x=odczyt.nextInt();
		kalkulator aa= new kalkulator(x);
		aa.licz(x);
		p= new kalkulator(aa,w);
		}
		break;
		case 2:
		{
		System.out.println("Podaj 1 parametr");
		y=odczyt.nextInt();
		System.out.println("Podaj 2 parametr");
		z=odczyt.nextInt();
		System.out.println("Podaj 3 parametr");
		d=odczyt.nextInt();
		System.out.println("Podaj 4 parametr");
		e=odczyt.nextInt();
		kalkulator ba = new kalkulator(y,z,d,e);
		wybor1();
		q=odczyt.nextInt();
		ba.licz(y, z, d, e, q);
		p= new kalkulator(ba,w);
		}
		break;
		case 3:
		{
		System.out.println("Podaj 1 parametr");
		f=odczyt.nextInt();
		System.out.println("Podaj 2 parametr");
		g=odczyt.nextInt();
		System.out.println("Podaj 3 parametr");
		h=odczyt.nextInt();
		System.out.println("Podaj 4 parametr");
		i=odczyt.nextInt();
		System.out.println("Podaj 5 parametr");
		j=odczyt.nextInt();
		System.out.println("Podaj 6 parametr");
		k=odczyt.nextInt();
		System.out.println("Podaj 7 parametr");
		l=odczyt.nextInt();
		kalkulator ca = new kalkulator(f,g,h,i,j,k,l);
		wybor1();
		q=odczyt.nextInt();
		ca.licz(f, g, h, i, j, k, l, q);
		p = new kalkulator(ca,w);
		}
		break;
		default:
			System.out.println("B³¹d");
			break;
		}
	}
}
