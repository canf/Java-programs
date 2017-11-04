/*
* Zadanie 47 – WeryfikacjaPesel
* autor: Krzysztof Wodziak (c) 2017
*
* Program odczytuje numer pesel wprowadzony przez u¿ytkoniwka, nastpnie sprwdza czy jest on poprawnie zapisany.
* U¿y³em algorytmu sprawdzjacego poprawnoœc cyfry kontrolnejz tej strony:
* http://zylla.wipos.p.lodz.pl/ut/pesel.html 
*
* Uruchomienie: java WeryfikacjaPesel
*
*/

import java.util.Scanner;
import java.lang.*;
public class WeryfikacjaPese{
	
		public static void main(String[] args){
			// deklaracja zmienne przechowuj¹cej pesel
			String pesel;
			// Odebranie od u¿ytownika jego numeru pesel i przyspisanie go do zmiennej. 
			System.out.println("Podaj swój numer pesel: ");
			Scanner key = new Scanner(System.in);
			pesel = key.next();
			// delkarcja tablicy 11 elementowej
			int[] peselArray = new int[11];
			
			for(int i = 0; i < pesel.length(); i++){
				// Sprawdzenie czy numer pesel zawiera tylko cyfry i czy ma d³ugoœæ 11 znaków
				if(!Character.isDigit(pesel.charAt(i)) && pesel.length() != 11){
					
					System.out.println("Poda³es b³edny numer pesel");
				
				} else {
					// przypisanie wartoœci ka¿dego znaku z zmiennej pesel do osobnego elementu tablicy
					peselArray[i] = Character.getNumericValue(pesel.charAt(i));
					
				}
			}
			// Dodanie do wag ka¿dej liczby numeru pesel
			int suma = 9 * peselArray[0]  + 7 * peselArray[1] + 3 * peselArray[2] + 1 * peselArray[3]  + 9 * peselArray[4]  + 7 * peselArray[5] + 3 * peselArray[6] + 1 * peselArray[7] + 9 * peselArray[8]  + 7 * peselArray[9];
			// Sprawdzanie czy wartoœæ modulo 10 zmiennej suma jest równa ostatniemu elementowi tablcy.  
			if (suma % 10 == peselArray[10]){
			
			System.out.println("Twój pesel jest poprawny.");
			
			} else {
				
			System.out.println("Poda³eœ b³edny pesel!");
			
			}
		}
}