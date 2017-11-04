/*
* Zadanie 26, PodatekVAT
*
* Program obliczaj�cy cen� brutto oraz warto�� VAT
*
* Autor: Mariusz Owczarski KrDZIs2013
* Data utworzenia: 22.10.2017
*
* Kompilacja: javac PodatekVAT.java
* Uruchomienie: java PodatekVAT
*
*/

import java.util.Scanner; // wykorztanie klasy Scanner z pakietu java.util

public class PodatekVAT {
	public static void main (String[] args) {
		
		// deklaracja zmiennych oraz sta�ej
		final double STAWKA_VAT = 0.22; 
    	double cenaNetto,cenaBrutto,wartoscVat;
        String nazwaTowaru;
        
	    Scanner klawiatura = new Scanner(System.in);
		
		// wczytanie danych z klawiatury
		System.out.println("Podaj nazwe towaru: ");
		nazwaTowaru = klawiatura.nextLine();
		System.out.println("Podaj jego cene netto: ");
		cenaNetto = klawiatura.nextDouble();
		
		// obliczenie wartosci VAT oraz ceny brutto
		wartoscVat=cenaNetto*STAWKA_VAT;
     	cenaBrutto= cenaNetto+wartoscVat;
     	
     	// wy�wietlenie rezultat�w
        System.out.println("\nNazwa towaru: " + nazwaTowaru);
        System.out.println("Cena netto : " + cenaNetto);
        System.out.println("Wartosc podatku VAT:" + wartoscVat);
		System.out.println("Cena brutto: " + cenaBrutto);
	}
}