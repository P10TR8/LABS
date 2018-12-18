package lab4;
import java.util.Random;

public class zad1 {
	static public void main(String[] args)
	{
		
		Random los = new Random();
		int a;
		int n=30;
		int tab[]=new int[n];
		int tab1[]=new int[n];
		
		for(int i=0; i<n; i++)
		{
			
			a=los.nextInt(52)+99;
			tab[i]=a;
			System.out.print(tab[i]+" ");
			
		}
		System.out.println(" ");
		int j=0;
		for(int i=0; i<n; i++)
		{
			tab1[j]=tab[i];
			System.out.print(tab1[j]+" ");
			j++;
			
			
		}
		
		
	}
}
