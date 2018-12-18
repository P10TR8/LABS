package lab7;

import java.time.LocalDate;
public class Samochod1 {
protected String marka;
protected String model;
protected float poj;
protected String typ;
protected String silnik;
protected int rok_p;
//String data_1_r;
protected LocalDate data_1_r = LocalDate.of(2017, 12, 30);
protected LocalDate now = LocalDate.now();
//int dl = now.lengthOfYear();
protected  float cena;

public void checkData()
{
if((data_1_r.plusYears(2).getYear())>(now.getYear()))
{
System.out.println("Gwarancja wazna");
}
else
System.out.println("Gwarancja wygasla");
}
public String getMarka()
{
return marka;
}
public String getModel()
{
return model;
}
public float getPoj()
{
return poj;
}
public String getTyp()
{
return typ;
}
public String getSilnik()
{
return silnik;
}
public int getRok()
{
return rok_p;
}
public LocalDate getData_1_r()
{
return data_1_r;
}
public float getCena()
{
return cena;
}



public void setMarka(String marka)
{
this.marka=marka;
}
public void setModel(String model)
{
this.model=model;
}
public void setPoj(float poj)
{
this.poj=poj;
}
public void setTyp(String typ)
{
this.typ=typ;
}
public void setSilnik(String silnik)
{
this.silnik=silnik;
}
public void setRok(int rok_p)
{
this.rok_p=rok_p;
}
public void setData_1_r(LocalDate data_1_r)
{
this.data_1_r=data_1_r;
}
public void setCena(float cena)
{
this.cena=cena;
}
}