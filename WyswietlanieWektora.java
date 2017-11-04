public class WyswietlanieWektora {

 static void inwersja(int[] tablica) { // utworzenie metody statycznej
 int i = 0;
 int j = tablica.length - 1;
 int pomoc;
 while (i < j) {
 pomoc = tablica[i];
 tablica[i] = tablica[j];
 tablica[j] = pomoc;
 i++;
 j--;
 }
 }
 	static void wyswietl(int[] tablica){
 		System.out.print(tablica);
 		
 	}
 public static void main(String[] args) {
 	
 int[] wektor = {4, 2, 7, 3, 9, 1, 8, 5}; // utworzenie wektora
 wyswietl(wektor);
 inwersja(wektor); // wywo³anie metody statycznej

 for(int liczba : wektor) // wyœwietlenie zawartoœci wektora
 System.out.print(liczba + " ");
 }
}
