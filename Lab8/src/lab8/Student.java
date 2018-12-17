package lab8;

public class Student {
String Imie;
String Nazwisko;
int Indeks;
int pesel;
public String getImie()
{
	return Imie; 
}
public String getNazwisko()
{
	return Nazwisko; 
}
public int getIndeks()
{
	return Indeks; 
}
public void UstawImie(String Imie)
{
	this.Imie=Imie;
}
public void UstawNazwisko(String Nazwisko)
{
	this.Nazwisko=Nazwisko;
}
public void Ustaw_pesel(int pesel)
{
	this.pesel=pesel;
}
public void setIndeks(int Indeks)
{
	this.Indeks=Indeks;
}

}
