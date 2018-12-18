package lab3;
import java.util.Scanner;
public class zad1 {
	public static void main(String[] args)
	{
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj cyfre/liczbe: ");
		float sredniap=0;
		float srednianp=0;
		int sparz=0;
		int snparz=0;
		int lp=0;
		int lnp=0;
		int dl=0;		
		String x = odczyt.nextLine();
		int l=0;
		dl=x.length();
		char[] dzielone = x.toCharArray(); 	
		int y;
		int k;
		int p=0;
		int d=10;
		k=dl;
		for(int i=0; i<dl; i++)
		{
			
			
			y = dzielone[i] - '0';
			l=y;
			for(int j=1; j<k; j++)
			{
				
				l=l*d;
			}
			p=p+l;
			
			if(y%2==0)
			{
				lp++;
				sparz=sparz+y;
			}
			else
			{
				snparz=snparz+y;
				lnp++;
			}
			k--;
			
		}
		if(lp==0)
		{
			lp=1;
		}
		else if(lnp==0)
		{
			lnp=1;
		}
		else;
		sredniap=(float)sparz/lp;
		//System.out.println("sredniap: "+sredniap);
		//System.out.println("lp: "+lp);
		srednianp=(float)snparz/lnp;
		//System.out.println("srednianp: "+srednianp);
		//System.out.println("lnp: "+lnp);
		//float st=(float)srednianp/sredniap;
		System.out.println("Stosunek œredniej nieparzystych do parzystych wynosi: "+srednianp+" / "+sredniap);
		int ldz=0;
		
	
		
				for(int e=1; e<=p; e++)
				{
					if(p%e==0)
					{
						ldz++;
					}
				}
				if(ldz>2)
				{
					System.out.println("Liczba nie jest pierwsza");
				}
				else
				{
					System.out.println("Liczba pierwsza");
				}
	}
}
