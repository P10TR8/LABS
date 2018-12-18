package Samochod;
import java.util.Random;
import java.time.LocalDate;
import java.util.ArrayList;
public class autokomis {
public static void main(String[] args) {
int a;
Random rand = new Random();
String[] mark= {"BMW","Mercedes","Opel","Ford","Fiat"};
String[] mo= {"e28", "w120", "Tigra", "focus RS", "126p"};
float[] po= {1, 2, 3, 4, 5};
String[] ty= {"hatchback", "sedan", "coupe", "combi", "suv"};
String[] silni={"benzyna", "diesel", "lpg", "benzyna+lpg", "hybryda"};
int[] ro= {1990, 1972, 2018, 2015, 2014};
float[] ce= {10000, 1000, 20000, 7000, 40000};
LocalDate dat;
int rozmiar=4;
int b, c, d;

ArrayList<Samochod> lista = new ArrayList(rozmiar);
for(int i=0; i<rozmiar;i++)
{
lista.add(new Samochod());
}


for(Samochod car:lista)
{
a=rand.nextInt(5)+0;
car.setMarka(mark[a]);
a=rand.nextInt(5)+0;
car.setModel(mo[a]);
a=rand.nextInt(5)+0;
car.setPoj(po[a]);
a=rand.nextInt(5)+0;
car.setTyp(ty[a]);
a=rand.nextInt(5)+0;
car.setSilnik(silni[a]);
a=rand.nextInt(5)+0;
car.setRok(ro[a]);
a=rand.nextInt(5)+0;
car.setCena(ce[a]);
b=rand.nextInt(47)+1972;
d=rand.nextInt(30)+1;
c=rand.nextInt(12)+1;
dat=LocalDate.of(b,c,d);
car.setData_1_r(dat);

}
for(int i=0; i<rozmiar;i++)
{
System.out.println(lista.get(i).getMarka());
System.out.println(lista.get(i).getModel());
System.out.println(lista.get(i).getPoj());
System.out.println(lista.get(i).getTyp());
System.out.println(lista.get(i).getSilnik());
System.out.println(lista.get(i).getRok());
System.out.println(lista.get(i).getCena());
System.out.println(lista.get(i).getData_1_r());
}

}

}


