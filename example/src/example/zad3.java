package example;
import java.util.Scanner;
public class zad3 {
	public static void main(String[] args) {
		Scanner odczyt = new Scanner(System.in); 
		double mila = odczyt.nextDouble();
		double kilom;
		double stala=1.609;
		kilom=stala*mila;
		System.out.println(mila+" mil = "+kilom+" km/h");
	}

}
