package lab4;
import java.util.Random;
public class zad2 {
	static public void main(String[] args)
	{
		Random los = new Random();
		int w=7;
		int k=7;
		int liczba=w*k;
		int suma=0;
		int liczba_m=0;
		int liczba_w=0;
		int srednia;
		int tab[][]= new int[w][k];
		int tab1[][]=new int[w][k];
		int a;
		
		
		for(int i=0; i<w; i++)
		{
			for(int j=0; j<k; j++)
			{
				a=los.nextInt(52)+99;//przykladowy przedzial z zad1
				tab[i][j]=a;
				System.out.print(tab[i][j]+" ");
				
			}
			System.out.println(" ");
			
		}
		int mint=tab[0][0];
		int maxt=tab[0][0];
		int min0=tab[0][0];
		int max0=tab[0][0];
		int min1=tab[0][1];
		int max1=tab[0][1];
		int min2=tab[0][2];
		int max2=tab[0][2];
		int min3=tab[0][3];
		int max3=tab[0][3];
		int min4=tab[0][4];
		int max4=tab[0][4];
		int min5=tab[0][5];
		int max5=tab[0][5];
		int min6=tab[0][6];
		int max6=tab[0][6];
		for(int i=0; i<w; i++)
		{
			for(int j=0; j<k; j++)
			{
				suma=suma+tab[i][j];
				
				if(mint<tab[i][j])
				{
					if(maxt<tab[i][j])
					{
						maxt=tab[i][j];	
					}
					
					
				}
				else if(mint>tab[i][j])
				{
					mint=tab[i][j];
				}
			
				switch(j)
				{
				case 0:
				{
					if(min0<tab[i][j])
				{
					if(max0<tab[i][j])
					{
						max0=tab[i][j];	
					}
					
					
				}
				else if(min0>tab[i][j])
				{
					min0=tab[i][j];
				}
				
				}
				break;
				case 1:
				{
					if(min1<tab[i][j])
				{
					if(max1<tab[i][j])
					{
						max1=tab[i][j];	
					}
					
					
				}
				else if(min1>tab[i][j])
				{
					min1=tab[i][j];
				}
				
				}
					break;
				case 2:
				{
					if(min2<tab[i][j])
				{
					if(max2<tab[i][j])
					{
						max2=tab[i][j];	
					}
					
					
				}
				else if(min2>tab[i][j])
				{
					min2=tab[i][j];
				}
				
				}
					break;
				case 3:
				{
					if(min3<tab[i][j])
				{
					if(max3<tab[i][j])
					{
						max3=tab[i][j];	
					}
					
					
				}
				else if(min3>tab[i][j])
				{
					min3=tab[i][j];
				}
				
				}
					break;
				case 4:
				{
					if(min4<tab[i][j])
				{
					if(max4<tab[i][j])
					{
						max4=tab[i][j];	
					}
					
					
				}
				else if(min4>tab[i][j])
				{
					min4=tab[i][j];
				}
				
				}
					break;
				case 5:
				{
					if(min5<tab[i][j])
				{
					if(max5<tab[i][j])
					{
						max5=tab[i][j];	
					}
					
					
				}
				else if(min5>tab[i][j])
				{
					min5=tab[i][j];
				}
				
				}
					break;
				case 6:
				{
					if(min6<tab[i][j])
				{
					if(max6<tab[i][j])
					{
						max6=tab[i][j];	
					}
					
					
				}
				else if(min6>tab[i][j])
				{
					min6=tab[i][j];
				}
				
				}
					break;
					default:
						break;
				}
				
			}
			
			
		}
		System.out.print("Min 1k= "+min0+" ");
		System.out.print("Max 1k= "+max0);
		System.out.println(" ");
		System.out.print("Min 2k= "+min1+" ");
		System.out.print("Max 2k= "+max1);
		System.out.println(" ");
		System.out.print("Min 3k= "+min2+" ");
		System.out.print("Max 3k= "+max2);
		System.out.println(" ");
		System.out.print("Min 4k= "+min3+" ");
		System.out.print("Max 4k= "+max3);
		System.out.println(" ");
		System.out.print("Min 5k= "+min4+" ");
		System.out.print("Max 5k= "+max4);
		System.out.println(" ");
		System.out.print("Min 6k= "+min5+" ");
		System.out.print("Max 6k= "+max5);
		System.out.println(" ");
		System.out.print("Min 7k= "+min6+" ");
		System.out.print("Max 7k= "+max6);
		System.out.println(" ");
		srednia=suma/liczba;
		for(int i=0; i<w; i++)
		{
			for(int j=0; j<k; j++)
			{
				if(tab[i][j]<srednia)
				{
					liczba_m++;
				}
				else if(tab[i][j]>srednia)
				{
					liczba_w++;
				}
				else;
				
			}
			
			
		}
		int wi=0;
		int ko=0;
		
		for(int i=w-1; i>=0; i--)
		{
			for(int j=k-1; j>=0; j--)
			{
				tab1[wi][ko]=tab[i][j];
				ko++;
				//System.out.print(tab[i][j]+" ");
				
			}
			ko=0;
			wi++;
			//System.out.println(" ");
		}
		System.out.println("Tablica 2:");
		for(int i=0; i<w; i++)
		{
			for(int j=0; j<k; j++)
			{
				
				System.out.print(tab1[i][j]+" ");
				
			}
			System.out.println(" ");
			
		}
		
		System.out.println("Srednia elementow tablicy= "+srednia);
		System.out.println("Min tab= "+mint);
		System.out.println("Max tab= "+maxt);
		System.out.println("Liczba mniejszych od sredniej= "+liczba_m);
		System.out.println("Liczba wiekszych od sredniej= "+liczba_w);
		
		
		
	}

}
