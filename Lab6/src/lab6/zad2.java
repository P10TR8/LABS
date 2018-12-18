package lab6;
import java.io.*;
//zadanie 2
public class zad2 {
	public static void main(String[] args)
	{
		int l=1;
		try {
		FileInputStream fin = new FileInputStream("C:/Users/user/Desktop/123.txt");
		int i=0;
		
		while((i=fin.read())!=-1)
		{
			if(l==11)//czytanie 10 linii z pliku
			{
				break;
			}
			System.out.print((char)i);
			
			if(i==13)
			{
				l++;
			}
			
			
		}
		
		fin.close();
		}catch(Exception e) {System.out.println(e);}
		
		
		
	}
}
