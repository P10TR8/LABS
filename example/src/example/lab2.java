package example;

public class lab2 {
	public static void main(String[] args)
	{
		int h=3;
		int k=1;
		int q=(h*2)-1; //podstawa
		int w=q-h; //iloœæ spacji przed gwiazd¹
		int o=w;
		for(int i=1; i<=h; i++)
		{
			for(int l=1; l<=w; l++)
			{
				System.out.print(" "); //wyswietlenie pierwszysch spacji
			}
			for(int j=1; j<=k; j++)
			{
				System.out.print("*"); 
				System.out.print(" "); //oddzielenie gwiazdek dodatkowymi spacjami
			}
			w--;
			k=k+1;
			System.out.println("");
			}
		for(int m=1; m<=o; m++)
		{
			System.out.print(" ");
		}
			System.out.println("#");
	}
}
