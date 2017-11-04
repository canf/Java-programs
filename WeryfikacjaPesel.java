/*
 Nazwa programu: WeryfikacjaPesel
 Data utworzenia: 27.10.2017
 Kompilacja i uruchomienie: javac WeryfikacjaPesel.java, java WeryfikacjaPesel
 
 Autor: Anna Mlodzik
 Gr KrDZIs2011
 193990
 */

import java.util.Scanner; // zaimportowanie biblioteki java.util, w ktorej znajduje sie klasa Scanner
public class WeryfikacjaPesel { //glowna klasa

    public static void main(String[] args) { //glowna metoda main

        System.out.println("Podaj 11-cyfrowy nr PESEL ktorego poprawnosc chcesz sprawdzic: ");
        Scanner keyboard = new Scanner(System.in); // utworzenie zmiennej 'keyboard' typu Scanner,
        // parametr konstruktora obiektu Scanner to strumien wejscia System.in

        //odczyt poszczegolnych cyfr znajdujacych sie na danej pozycji numeru pesel										   
        String pesel = keyboard.nextLine();
        int First = Character.getNumericValue(pesel.charAt(0));
        int Second = Character.getNumericValue(pesel.charAt(1));
        int Third = Character.getNumericValue(pesel.charAt(2));
        int Fourth = Character.getNumericValue(pesel.charAt(3));
        int Fifth = Character.getNumericValue(pesel.charAt(4));
        int Sixth = Character.getNumericValue(pesel.charAt(5));
        int Seventh = Character.getNumericValue(pesel.charAt(6));
        int Eighth = Character.getNumericValue(pesel.charAt(7));
        int Ninth = Character.getNumericValue(pesel.charAt(8));
        int Tenth = Character.getNumericValue(pesel.charAt(9));
        int Eleventh = Character.getNumericValue(pesel.charAt(10));

        //Algorytm sprawdzania poprawnosci cyfry kontrolnej 
        int sum = First * 1 + Second * 3 + Third * 7 + Fourth * 9 + Fifth * 1 + Sixth * 3 + Seventh * 7 + Eighth * 9 + Ninth * 1 + Tenth * 3;
        sum %= 10;
        sum = 10 - sum;
        sum %= 10;

        //output
        if (sum == Eleventh) {
            System.out.println("Nr PESEL jest poprawny");
        } else {
            System.out.println("Niepoprawny nr PESEL");
        }

    }
}