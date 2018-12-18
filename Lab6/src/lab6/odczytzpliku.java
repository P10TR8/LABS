package lab6;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
//zadanie 5
public class odczytzpliku {
public static void main(String[] args) throws IOException
{
	File plik = new File("C:/Users/user/Desktop/plik.csv");
	Scanner odczyt = new Scanner(plik);
	StringTokenizer token;
	int w=10;
	int k=10;
	int[][] tab= new int[w][k];
	int i=0;
	int j=0;
	while(odczyt.hasNextLine())
	{
		
		token=new StringTokenizer(odczyt.nextLine(),",");
		while(token.hasMoreElements())
		{
			int h = Integer.parseInt(token.nextToken());
			tab[i][j]=h;
			System.out.println("Tab["+i+"]"+"["+j+"] = "+tab[i][j]);
			
			j++;
		}
		j=0;
		i++;
	}
	odczyt.close();
}
}
