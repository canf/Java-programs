/**
 * @(#)SymulatorRzutuKostka.java
 * zadanie 54
 * javac SymulatorRzutuKostka.java
 * java SymulatorRzutuKostka
 * KrDzIS2013
 * @author Michal Nowakowski
 * program przeprowadza symulacje n rzutow kostka do gry i zwraca ilosc poszczegolnych oczek ktora zostala wyrzucona
 * @version 1.00 2017/10/25
 */


import  java.util.Random; //biblioteka potrzebna do losowania liczb pseudolosowych
import java.util.Scanner;

public class SymulatorRzutuKostka {

	public static void main(String[] args){
		
   		Random generator = new Random(); //tworze nowy obiekt Random
   		Scanner keyboard = new Scanner(System.in);
		int n = 0;
		int number;	
		int[] stats = new int[6];	
	
		System.out.println("How many times you want to throw a dice :"); 
		n = keyboard.nextInt();//ile wykonac rzutow
		//petla w ktorej odbywa sie "rzucanie kostka" i przypisywanie liczby oczek do odpowiedniego miejsca w tablicy
		for(int i=0;i<n;i++){
			number = generator.nextInt(6)+1;
			System.out.println("number = "+number);
			if(number == 1){
				stats[0] +=1;
			}
			if(number == 2){
				stats[1] +=1;
			}
			if(number == 3){
				stats[2] +=1;
			}
			if(number == 4){
				stats[3] +=1;
			}
			if(number == 5){
				stats[4] +=1;
			}
			if(number == 6){
				 stats[5] +=1;
			}	
		}
				  		
		//wyswietlanie statystyki w sposob pokazany w ksiazce
		System.out.println();
    	System.out.println("Statistics of "+n+" throws");
    	System.out.println("=======================");
    	System.out.println("cube    | \tquantity");
    	System.out.println("-----------------------");
    	System.out.println("1\t\t|\t\t"+stats[0]);
    	System.out.println("2\t\t|\t\t"+stats[1]);
    	System.out.println("3\t\t|\t\t"+stats[2]);
    	System.out.println("4\t\t|\t\t"+stats[3]);
    	System.out.println("5\t\t|\t\t"+stats[4]);
    	System.out.println("6\t\t|\t\t"+stats[5]);
	}
}