
package lab4;

public class zad4 {
static public void main(String[] args)
{
int w=15;
int k=15;
int l=15;
int suma=0;
int srednia=0;
int tab[][]=new int[w][k];
int tab1[][]=new int[1][k];
for(int i=1; i<w; i++)
{
for(int j=1; j<k; j++)
{
tab[i][j]=i*j;
System.out.print(tab[i][j]+" ");
}
System.out.println(" ");
}
int j=1;
int h;
int n=0;
int m=0;
for(int i=1; i<w; i++)
{
suma=0;
srednia=0;
if(j<k) {
for(int z=1; z<k; z++)
{
	if(i<w) {
suma=suma+tab[i][j];
i++;
	}
}

}
srednia=suma/14;
tab1[m][n]=srednia;
if(j==k-1)
{
	break;
}
i=0;
j++;
n++;
}
System.out.print("Srednie z poszczegolnych kolumn: ");
for(int i=0; i<1; i++)
{
for( j=0; j<k-1; j++)
{
System.out.print(tab1[i][j]+" ");
}
System.out.println(" ");
}
}
}

