package lab4;
import java.util.Random;
public class zad5 {
	static public void main(String[] args)
	{
		Random los = new Random();
		int a;
		int n=40;
		int tab[]=new int[n];
		for(int i=0; i<n; i++)
		{
			if(i<=10)
			{
				a=los.nextInt(5)+1;
				tab[i]=a;
			}
			else if(i>=11 && i<=20)
			{
				a=los.nextInt(5)+6;
				tab[i]=a;
			}
			else if(i>=21 && i<=30)
			{
				a=los.nextInt(45)+11;
				tab[i]=a;
			}
			else
			{
				a=los.nextInt(16)+60;
				tab[i]=a;
			}
			
			
			
		}
		for(int i=0; i<n; i++)
		{
			System.out.print(tab[i]+" ");
			
			
			
		}
		
		
		
	}
}
