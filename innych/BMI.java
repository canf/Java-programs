/*
* Kalkulator BMI
*
* autor: Mateusz Gut (c) 2017
*
* Numer Dziekański: 199693
*
* Grupa Dziekańska: KrDZIs2012
* 
* Zawartość programu:
*
* Program pozwala wyliczyć wskaźnik BMI
*
* Należy podać swój wzrost oraz wagę, a program zajmie się
* obliczeniem wskaźnika BMI i poinformuje o wyniku.
*
* Użyte klasy: 
*
* java.util.Scanner; 
*
* Uruchamianie programu:
*
* Kompilacja: javac BMI.java
*
* Uruchomienie programu: java BMI
*
*/

import java.util.Scanner; // Import klasy Scanner

public class BMI {
	public static void main(String[] args) {
		
		// Wyświetlanie informacji na temat programu i jego działania
		
		System.out.println("Witamy w kalkulatorze wskaznika BMI. \n");
		System.out.println("Jesli sytuacja tego wymaga wartosci dotyczace\nwagi i wzrostu nalezy podawac wykorzystujac przecinek np. 1,85. \n");
		System.out.println("Nie ma potrzeby podawania jednostek. \n");
		
		double wzrost, waga, bmi; // Deklaracja zmiennych wzrost, waga oraz BMI
		Scanner odczyt = new Scanner(System.in); // Obiekt odpowiedzialny za odbieranie danych		
		
		System.out.println("Podaj swoj wzrost w metrach: \nNastepnie nacisnij Enter");
		wzrost = odczyt.nextDouble(); // Odebranie danej dotyczącej wzrostu
		
		System.out.println("Podaj swoja wage w kilogramach: \nNastepnie nacisnij Enter");
		waga = odczyt.nextDouble(); // Odebranie danej dotyczącej wagi
		
		bmi = waga/(wzrost*wzrost); // Obliczenie wartości BMI za pomocą odpowiedniego wzoru
		System.out.println("Twoje BMI wynosi: "+bmi); // Wyświetlanie wyniku liczbowego
		
		// Instrukcja warunkowa If Else, dzięki której uzyskujemy informację na temat otrzymanego wyniku
		
		
		if ( bmi < 20) {
			System.out.println("Twoje BMI jest zbyt niskie masz niedowage"); // BMI mniejsze, niż 20 oznacza niedowagę
		}  
			else if ( bmi <= 25) {
				System.out.println("Twoje BMI jest poprawne"); // Prawidłowe BMI powinno osiągać wartości z zakresu <20;25>
		    } 		
				else {
					System.out.println("Twoje BMI jest za wysokie masz nadwage"); // BMI większe niż 25 oznacza nadwagę
				}	
	}
}	