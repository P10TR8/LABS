package lab6;
import java.io.*;
import java.util.Scanner;
//zadanie 3
public class zapisadopliku {
public static void main(String[] args) throws IOException
{
	Scanner odczyt = new Scanner(System.in);
	
	File file = new File("C:/Users/user/Desktop/plik1.txt");
	if(!file.exists())
	{
		file.createNewFile();
	}
	FileWriter fw = new FileWriter(file.getAbsoluteFile());
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write("Wynik dzia�ania kalkulatora z zadania 1");
	bw.newLine();
	bw.write("Kalkulator 1 parametrowy wybor 1");
	System.out.println("Kalkulator 1 parametrowy wybor 1");
	//bw.write("Wybierz 1 - konstruktor 1 parametrowy, 2 - konstruktor 4 parametrowy, 3 konstruktor 7 parametrowy");
	bw.newLine();
	kalkulatorwrite.wybor();
	int xy=1;
	bw.write(String.valueOf(xy));
	bw.newLine();
	bw.write("Podaj parametr/liczb�: ");
	bw.newLine();
	System.out.println("Podaj parametr/liczb�: ");
	int k=odczyt.nextInt();
	bw.write(String.valueOf(k));
	bw.newLine();
	bw.write("Kwadrat: ");
	kalkulatorwrite k1= new kalkulatorwrite(k);
	bw.write(String.valueOf(k1.licz(k)));
	bw.newLine();
	System.out.println("Kalkulator 2 parametrowy wybor 2");
	bw.write("Kalkulator 2 parametrowy");
	xy=2;
	bw.newLine();
	bw.write(String.valueOf(xy));
	bw.newLine();
	System.out.println("Podaj 1 parametr/liczb�: ");
	bw.write("Podaj 1 parametr/liczb�: ");
	
	k=odczyt.nextInt();
	bw.write(String.valueOf(k));
	bw.newLine();
	System.out.println("Podaj 2 parametr/liczb�: ");
	bw.write("Podaj 2 parametr/liczb�: ");
	
	int l=odczyt.nextInt();
	bw.write(String.valueOf(l));
	bw.newLine();
	System.out.println("Podaj 3 parametr/liczb�: ");
	bw.write("Podaj 3 parametr/liczb�: ");
	
	int m=odczyt.nextInt();
	bw.write(String.valueOf(m));
	bw.newLine();
	System.out.println("Podaj 4 parametr/lczb�: ");
	bw.write("Podaj 4 parametr/liczb�: ");
	
	int n=odczyt.nextInt();
	bw.write(String.valueOf(n));
	bw.newLine();
	kalkulatorwrite k2 = new kalkulatorwrite(k,l,m,n);
	bw.write("Kolejne dzia�ania na liczbach");
	System.out.println("Kolejne dzia�ania na liczbach");
	bw.newLine();
	
	bw.write("Suma: ");
	bw.write(String.valueOf(k2.licz(k,l,m,n,1)));
	bw.newLine();
	
	bw.write("R�nica: ");
	bw.write(String.valueOf(k2.licz(k,l,m,n,2)));
	bw.newLine();
	
	bw.write("Iloczyn: ");
	bw.write(String.valueOf(k2.licz(k,l,m,n,3)));
	bw.newLine();
	
	bw.write("Iloraz: ");
	bw.write(String.valueOf(k2.licz(k,l,m,n,4)));
	bw.newLine();
	
	
	
	
	bw.newLine();
	System.out.println("Kalkulator 3 parametrowy wybor 3");
	bw.write("Kalkulator 3 parametrowy");
	xy=3;
	bw.newLine();
	bw.write(String.valueOf(xy));
	bw.newLine();
	System.out.println("Podaj 1 parametr/liczb�: ");
	bw.write("Podaj 1 parametr/liczb�: ");
	
	k=odczyt.nextInt();
	bw.write(String.valueOf(k));
	bw.newLine();
	System.out.println("Podaj 2 parametr/liczb�: ");
	bw.write("Podaj 2 parametr/liczb�: ");
	
	l=odczyt.nextInt();
	bw.write(String.valueOf(l));
	bw.newLine();
	System.out.println("Podaj 3 parametr/liczb�: ");
	bw.write("Podaj 3 parametr/liczb�: ");
	
	m=odczyt.nextInt();
	bw.write(String.valueOf(m));
	bw.newLine();
	System.out.println("Podaj 4 parametr/lczb�: ");
	bw.write("Podaj 4 parametr/liczb�: ");
	
	n=odczyt.nextInt();
	bw.write(String.valueOf(n));
	bw.newLine();
	
	System.out.println("Podaj 5 parametr/lczb�: ");
	bw.write("Podaj 5 parametr/liczb�: ");
	
	int o=odczyt.nextInt();
	bw.write(String.valueOf(o));
	bw.newLine();
	
	System.out.println("Podaj 6 parametr/lczb�: ");
	bw.write("Podaj 6 parametr/liczb�: ");
	
	int p=odczyt.nextInt();
	bw.write(String.valueOf(p));
	bw.newLine();
	
	System.out.println("Podaj 7 parametr/lczb�: ");
	bw.write("Podaj 7 parametr/liczb�: ");
	
	int r=odczyt.nextInt();
	bw.write(String.valueOf(r));
	bw.newLine();
	
	kalkulatorwrite k3 = new kalkulatorwrite(k,l,m,n,o,p,r);
	bw.write("Kolejne dzia�ania na liczbach");
	System.out.println("Kolejne dzia�ania na liczbach");
	bw.newLine();
	
	bw.write("Suma: ");
	bw.write(String.valueOf(k3.licz(k,l,m,n,o,p,r,1)));
	bw.newLine();
	
	bw.write("R�nica: ");
	bw.write(String.valueOf(k3.licz(k,l,m,n,o,p,r,2)));
	bw.newLine();
	
	bw.write("Iloczyn: ");
	bw.write(String.valueOf(k3.licz(k,l,m,n,o,p,r,3)));
	bw.newLine();
	
	bw.write("Iloraz: ");
	bw.write(String.valueOf(k3.licz(k,l,m,n,o,p,r,4)));
	bw.newLine();
	
	bw.write("Wywo�anie konstruktora kopiuj�cego, jednoparametrowego: kalkulatorwrite k4 = new kalkulatorwrite(k3,1);");
	System.out.println("Wywo�anie konstruktora kopiuj�cego, jednoparametrowego: kalkulatorwrite k4 = new kalkulatorwrite(k3,1);");
	bw.newLine();
	kalkulatorwrite k4 = new kalkulatorwrite(k3,1);
	int u= k4.x;
	bw.write(String.valueOf(u));
	System.out.println(u);
	
	
	bw.close();
}
}
