package lab7;
import java.util.ArrayList;
//zadanie 2
public class student{
String imie;
String nazwisko;
int nr_indeksu;
public String getNazwisko()
{
	return nazwisko;
}
public String getImie()
{
	return imie;
}
public int getNumer()
{
	return nr_indeksu;
}

void setNazwisko(String n)
{
	nazwisko=n;
}
void setImie(String n)
{
	imie=n;
}
void setNumer(int n)
{
	nr_indeksu=n;
}
static void show(int l)
{
	System.out.println("Lista z zadania 2 zawiera "+l+" elementy[ów].");
}
static void show1(int a)
{
	System.out.println("W "+a+" elemencie znajduje siê: ");
}
public static void main(String[] args)
{
	int rozmiar=4; //rozmiar listy
	ArrayList<student> lista=new ArrayList<student>(rozmiar);
	for(int i=0; i<rozmiar; i++)
	{
		lista.add(new student());
	}
	
	for(student st:lista)
	{
		st.setImie("Jan");
		st.setNazwisko("Nowak");
		st.setNumer(99156);
	}
	/*for(int i=0; i<rozmiar; i++)
	{
		System.out.println(lista.get(i).getImie());
		System.out.println(lista.get(i).getNazwisko());
		System.out.println(lista.get(i).getNumer());
	}*/
	
	//zadanie 3
	
	int l;
	l=lista.size();
	show(l);
	int w=3;
	show1(w);
	System.out.println(lista.get(w).getImie());
	System.out.println(lista.get(w).getNazwisko());
	System.out.println(lista.get(w).getNumer());
	
	
}

}
