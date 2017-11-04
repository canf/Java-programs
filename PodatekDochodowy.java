/*
Program PodatekDochodowy.java
Data utworzenia: 23.10.2017
Sposob kompilacji: javac PodatekDochodowy.java
Sposob uruchomienia: java PodatekDochodowy

Autor: Anna Mlodzik
Nr grupy dziekanskiej: KrDZIs2011
Nr indeksu: 193990
*/

import java.util.Scanner; // zainportowanie klasy Scanner z pakietu java.util

public class PodatekDochodowy { //g³owna klasa
	public static void main (String[] args) { //metoda main
		double podatek;
		double dochod; //deklaracja zmiennych
		double stala1 = 0.18;
  		double stala2 = 0.32;
	    Scanner klawiatura = new Scanner(System.in);  // parametr konstruktora obiektu Scanner to strumien wejscia System.in
	
		System.out.println("Podaj wartosc dochodu: "); // na ekranie wyswietlane jest polecenie
		dochod = klawiatura.nextDouble(); //u¿ytkownik wpisuje wartoœæ
			
		/* Je¿eli dochód jest mniejszy ni¿ 85528 to oblicz 18% z niego.	
		Je¿eli wiêkszy, oblicz ró¿nicê dochodu i 85528,
		policz 32% z niej a nastêpnie dodaj 15396.04 */
     					
		if (dochod < 85528){ 
		podatek = (dochod * stala1); 
		} else podatek = ((dochod - 85528) * stala2 ) + 15395.04; 
		
     System.out.println("Podatek wynosi " + podatek + " PLN."); //wyœwietlenie wartoœci podatku
	}
}