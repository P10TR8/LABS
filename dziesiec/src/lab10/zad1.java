package lab10;
import java.util.Scanner;

public class zad1 {
	public static void main(String[] args){
		  int a, b, c;
		  Scanner odczyt= new Scanner(System.in);
		  a=odczyt.nextInt();
		  b=odczyt.nextInt();
		  
		  try {
			  c=a/b;  
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Nie dziel przez zero");
			  
		  }
		  
	  }
}
