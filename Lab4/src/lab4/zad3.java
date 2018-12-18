package lab4;

public class zad3 {
	static public void main(String[] args)
	{
		int n=40;
		boolean tab[] = new boolean[n];
		
		for(int i=0; i<n; i++)
		{
			if(i%2==0)
			{
				tab[i]=false;
			}
			else
			{
				tab[i]=true;
			}	
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.print(tab[i]+" ");		
		}
		
	}
}
