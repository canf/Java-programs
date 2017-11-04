/*
 Nazwa programu: WyszukiwanieWymiana
 Data utworzenia: 30.10.2017
 Kompilacja i uruchomienie: javac WyszukiwanieWymiana.java, java WyszukiwanieWymiana
 
 Autor: Anna Mlodzik
 Gr KrDZIs2011
 193990
 */


import java.util.Scanner; // zaimportowanie biblioteki java.util, w ktorej znajduje sie klasa Scanner

public class WyszukiwanieWymiana { //glowna klasa

    public static void main(String[] args) { //glowna metoda main
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz zdanie: ");
        String ciag1 = scan.nextLine(); //odczyt danych z konsoli
        System.out.println("Wprowadz slowo z powyzszego zdania ktore chcesz podmienic: ");
        String ciag2 = scan.next();
        System.out.println("Wprowadz nowe slowo do podmienienia: ");
        String ciag3 = scan.next();

        ciag1 = ciag1 + " ";
        String nowyciag = ""; //deklarowanie nowych zmiennych potrzebnych do utworzenia nowego ciagu
        String temp = "";

        /*petla dialajaca do konca zdania. 
         *Zmienna x skanuje poszczegolne znaki ciagu w petli.
         *Jezeli znak nie jest spacja petla przechodzi przez cale slowo i zapisuje je
         *w tymczasowej zmiennej (temp), jesli znak jest spacja sprawdzane jest czy to slowo
         *rowna sie wpisanej zmiennej ciag2. Jesli tak, slowo jest zamieniane i przechowane w
         *nowym ciagu. Jesli nie, to slowo w tymczasowej zmiennej temp jest przechowane w nowym ciagu.
         **/
        for (int i = 0; i < ciag1.length(); i++) {
            char x = ciag1.charAt(i);
            if (x != ' ') {
                temp = temp + x;
            } else {
                if (ciag2.equals(temp)) {
                    nowyciag = nowyciag + ciag3;
                } else {
                    nowyciag = nowyciag + temp;
                }
                nowyciag = nowyciag + " ";
                temp = "";
            }
        }
        System.out.println("Nowe zdanie to :" + "\n" + nowyciag);

    }
}