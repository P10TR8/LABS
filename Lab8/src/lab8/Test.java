package lab8;

public class Test {
public static void main(String[] args)
{
	StudentInstytut s1 = new StudentInstytut();
	s1.UstawImie("Jan");
	s1.UstawNazwisko("Nowak");
	s1.Ustaw_pesel(1212312414);
	s1.Ustaw_wydzial("WiEA");
	s1.Ustaw_Instytut("Jakiœ instytut");
	s1.getInstytut();
	System.out.println(s1.getInstytut()+s1.getImie());
}
}
