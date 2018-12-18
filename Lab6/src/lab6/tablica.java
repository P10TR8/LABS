package lab6;
import java.util.Random;
import java.io.*;
//zadanie 4
public class tablica {
	public static void main(String[] args)  throws IOException
	{
		File file = new File("C:/Users/user/Desktop/plik.csv");
		if(!file.exists())
		{
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
Random rand = new Random();
int r;

int w=10;
int k=10;
int tab[][]=new int[w][k];

for(int i=0; i<w; i++)
{
	for(int j=0; j<k; j++)
	{
		r=rand.nextInt(100)+1;
		tab[i][j]=r;
		
		pw.print(r+",");
		
	}
	pw.println();
}
pw.flush();
pw.close();

}
}