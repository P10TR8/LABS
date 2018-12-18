package lab4;
//import java.util.Scanner;
public class zad6 {
public static void main(String[] args)
{
	//Scanner odczyt = new Scanner(System.in);
	//String x = odczyt.nextLine();
	String x = "abcdefghijklmnopqrstuvwxyz";
	int dl=x.length();
	System.out.println("Dlugosc x: "+dl);
	int w=2;
	int k=13;
	int l=0;
	char tab[]=x.toCharArray();
	char tab1[][]= new char[w][k];
	for(int i=0; i<w; i++)
	{
		for(int j=0; j<k; j++)
		{
			tab1[i][j]=tab[l];
			l++;
		}
		//System.out.println("Tab["+i+"]: "+tab[i]);
		//l=0;
	}
	for(int i=0; i<w; i++)
	{
		for(int j=0; j<k; j++)
		{
			//System.out.println("Tab["+i+"]["+j+"]: "+tab1[i][j]);
			System.out.print(tab1[i][j]+" ");
		}
		System.out.println(" ");
		
	}
}
}
