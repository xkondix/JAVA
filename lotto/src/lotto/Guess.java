package lotto;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;



public class Guess {

	private static int ile_prob = 0;
	private static int strzal=0;
	static Random r = new Random();
	static int liczba = r.nextInt(100) + 1;

	public Guess(int strzal) {
		this.strzal = strzal;
		

	}

	String[] Oblicz() {

		String tab[] = new String[2];

	
			ile_prob++;
			tab[0] = String.valueOf(ile_prob);


			//String k = "";

			if (strzal == liczba) {
				tab[1] = "Udalo sie! Wygrywasz " + ile_prob + " proba ";
			} else if (strzal < liczba) {
				tab[1] = "TO zamalo";
			}

			else if (strzal > liczba) {
				tab[1] = "TO zaduzo";
			}

		
		//System.out.println("strzal: "+strzal+" proby: "+ile_prob+" liczba: "+ liczba);

		
		return tab ;

	}
	
	void Restart()
	{
		 ile_prob = 0;
		 liczba= liczba = r.nextInt(100) + 1;
		 
	}





public static void main(String[] args) {
	while (strzal != liczba) {
		Scanner oczyt = new Scanner(System.in);
		strzal = oczyt.nextInt();
		Guess graj = new Guess(strzal);
		String tabli[] = (String []) graj.Oblicz();
		System.out.println(tabli[0]);
		System.out.println(tabli[1]);
	
	}
}
}