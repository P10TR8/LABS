package lab9;
import java.io.*;
import java.time.LocalDate;
import java.util.Random;

import lab9.zad2R;
import lab9.zad2T;
import lab9.read;
public class zad2 {

	static String nazwapliku = "zad2_logi.txt";
static synchronized void inFile(LocalDate data, int film, int klient, int ocena)
{
	try {
		BufferedWriter write = new BufferedWriter(new FileWriter(nazwapliku, true));
		 write.append("\n");
         write.append("ID_Uzykownika: ").append(String.valueOf(klient)).append("ID_filmu: ").append(String.valueOf(film)).append(" Ocena: ").append(String.valueOf(ocena)).append(" Data oceny ").append(String.valueOf(data.getDayOfMonth())).append("-").append(String.valueOf(data.getMonthValue())).append("-").append(String.valueOf(data.getYear()));
         write.append("  Klasa: ").append(new Exception().getStackTrace()[1].getClassName());
         write.close();
	}
	catch(Exception e)
	{
		 e.printStackTrace();
	}
}
static synchronized void outFile(){
    try{
        String line;
        BufferedReader read = new BufferedReader(new FileReader(nazwapliku));
        while(read.readLine() !=null){
            line = read.readLine();
            System.out.println(line);
        }

    }
    catch (IOException e){
        e.printStackTrace();
    }
}

public static void main(String[] args) throws Exception
{
    File file = new File(nazwapliku);

    if (!file.exists()) {
        for (int i = 0; i < 10; i++) {
            zad2 R = new zad2();
        }
        for (int i = 0; i < 10; i++) {
        	zad2T logT = new zad2T();
        }
    }
    for(int i=0;i<1;i++){
        read czytaj = new read();
    }
}
}
