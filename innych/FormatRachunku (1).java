/*
Nazwa programu: FormatRachunku
Data utworzenia: 22.10.2017
Sposob kompilacji: javac FormatRachunku.java
Sposob uruchomienia: java FormatRachunku

Autor: Maria Pszczola
Nr grupy dziekanskiej: KrDZIs2014
Nr indeksu: 201131
*/

import java.util.*;// zaimportowanie biblioteki java.util, w ktorej znajduje sie klasa Scanner
import java.lang.*; // zaimportowanie biblioteki java.lang, w ktorej znajduje sie klasa StringBuilder

 
public class FormatRachunku { //glowna klasa
  public static void main(String[] args) { //glowna metoda main
  
    Scanner input = new Scanner(System.in);// utworzenie zmiennej 'input' typu Scanner,
										   // parametr konstruktora obiektu Scanner to strumieñ wejœcia System.in
	
    System.out.println("Podaj numer rachunku skladajacy sie z 26 cyfr: "); // na ekranie wyswietlane jest polecenie
	
    StringBuilder sb = new StringBuilder(); // utworzenie obiektu 'sb' typu StringBuilder
    int liczbaZnakow = 0;
	
	// dopoki liczba wprowadzanych znakow jest mniejsza od 26
	// do obiektu 'sb' dodawaj kolejne wprowadzane znaki
    while(liczbaZnakow<26) {
      String znaki = input.next();
      liczbaZnakow += znaki.length();
      sb.append(znaki);
	  // jesli liczba wprowadzonych znakow jest wieksza od 26 wyswietl komunikat o bledzie
      if(liczbaZnakow>26) {
        System.out.println("Podales za duzo znakow");
        System.exit(0);
      }
    }
	
   String rezultat = sb.toString(); //metoda 'toString()' zamienia obiekt 'sb' typu StringBuilder na obiekt typu String
 
   System.out.println("Wyswietlenie sformatowanego numeru"); // wyswietlenie podanego numeru rachunku bankowego wg wzoru 
															 // XX XXXX XXXX XXXX XXXX XXXX XXXX 
   System.out.println(rezultat.substring(0,2)+ " " + 
					  rezultat.substring(2,6) + " " + 
				      rezultat.substring(6,10) + " " + 
					  rezultat.substring(10,14) + " " +
					  rezultat.substring(14,18) + " " +
					  rezultat.substring(18,22) + " " +
					  rezultat.substring(22,26));
 }
}
 
