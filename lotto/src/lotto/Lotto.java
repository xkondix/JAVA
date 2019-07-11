package lotto;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Lotto {
	private static Random r = new Random();
	private static int Kwota = r.nextInt(1000000) + 1;
	private static int liczba[] = new int[6];
	private static int ile_kulek = 49;
	private static final int ile_wylosowac = 6;
	private static int ile_wylosowano = 0;
	private static int wylosowane[] = new int[ile_wylosowac + 1];
	private static boolean losowanie_ok = true, tak=false;
	private static int ilosc_trafionych = 0, licznik = 0;
	private static String kwota="";

	int[] Obliczenia() {

		for (int i = 1; i <= ile_wylosowac; i++) {
			do {
				int liczba = r.nextInt(ile_kulek) + 1;

				{

					losowanie_ok = true;

					for (int j = 1; j <= ile_wylosowano; j++) {

						if (liczba == wylosowane[j])
							losowanie_ok = false;
					}

					if (losowanie_ok == true) {

						ile_wylosowano++;
						wylosowane[ile_wylosowano] = liczba;
					}
				}
			}

			while (losowanie_ok != true);
		}

		return wylosowane;

	}

	String Sprawdz(int a, int b, int c, int d, int e, int f) {

		
		int liczby[] = { a, b, c, d, e, f };
		
		for(int i=0; i<6; i++)
		{
			for(int j=i+1; j<6; j++)
			{
				if (liczby[i]==liczby[j])
				{
					liczby[j]=0;
				}
			}
			
		}
		
		
		for(int i =0; i<liczby.length; i++)
		{
			for(int j = 1; j<=liczby.length;j++)
			{
				if(liczby[i]==wylosowane[j])
				{
				tak=true;
				licznik++;
				}
			}
		}
		
		
		
	
		
		int wyniki[] = new int[licznik];
		int k=0;
		
		
		
		
		for(int i =0; i<liczby.length; i++)
		{
			for(int j = 1; j<=liczby.length;j++)
			{
				if(liczby[i]==wylosowane[j])
				{
					wyniki[k]=liczby[i];
						k++;
				//System.out.println("i "+i+" j "+j+" licznik "+ licznik+ " liczby[i] "+liczby[i]+" wylosowane[j] "+ wylosowane[j]);
				
				}
			}
		}
		
		
		
		
		String zmienna="";
		
		if (tak==false)
		{
			 zmienna="Nie trafi³eœ nic";
		}
		else
		{
		 zmienna="Trafli³eœ liczby/liczbe: ";

		for(int i = 0; i<wyniki.length; i++)
		{
			zmienna+=wyniki[i]+" ";
		}
		}

		
		
		
		return zmienna;

	}
	
	String Wygrana()
	{
	
		switch(licznik)
		{
		case 0:
			kwota="Nastêpnym razem bêdzie lepiej";
		      
		      break;
		 
		    case 1:
		    	kwota="Nastêpnym razem bêdzie lepiej";
		      break;
		    case 2:
		    	kwota="Nastêpnym razem bêdzie lepiej";
		      break;
		    case 3:
		    	kwota= Kwota*0.125 +" z³";
		      break;
		    case 4:
		    	kwota= Kwota*0.25 +" z³";
		      break;
		    case 5:
		    	kwota= Kwota*0.5 +" z³";
		      break;
		    case 6:
		    	kwota= Kwota +" z³";
		      break;
		 
		    default:
		      kwota="nieprzewidziana sytuacja";
		}
		
		return kwota;
	}
	
	void Restart() 
	{
		ile_wylosowano = 0;
		Kwota=Kwota = r.nextInt(1000000) + 1;
		losowanie_ok = true;
		ilosc_trafionych = 0;
		licznik = 0;
		kwota="";
		tak=false;
	}
	
	
	

	public static void main(String[] args) {
		Lotto k = new Lotto();
		int tabli[] = (int[]) k.Obliczenia();
		for(int i =1; i<tabli.length; i++)
		{
			System.out.println(tabli[i]);
		}
		
		
		System.out.println(k.Sprawdz(1,2,3,4,5,6));
		
		
		}

	}
