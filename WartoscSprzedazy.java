import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class WartoscSprzedazy {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz wartosci kwot jakie uzyskalo 10 pracownikow handlowych firmy MIKOM sp. z o.o. ze sprzedazy odkurzaczy domowych: ");
       Double[] arr = new Double[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Pracownik nr 1: ");
            arr[0] = input.nextDouble();
            System.out.println("Pracownik nr 2: ");
            arr[1] = input.nextDouble();
            System.out.println("Pracownik nr 3: ");
            arr[2] = input.nextDouble();
            System.out.println("Pracownik nr 4: ");
            arr[3] = input.nextDouble();
           /System.out.println("Pracownik nr 5: ");
            arr[4] = input.nextDouble();
            System.out.println("Pracownik nr 6: ");
            arr[5] = input.nextDouble();
            System.out.println("Pracownik nr 7: ");
            arr[6] = input.nextDouble();
            System.out.println("Pracownik nr 8: ");
            arr[7] = input.nextDouble();
            System.out.println("Pracownik nr 9: ");
            arr[8] = input.nextDouble();
            System.out.println("Pracownik nr 10: ");
            arr[9] = input.nextDouble();
            break;
        }

       Arrays.sort(arr, Collections.reverseOrder()); //metoda sortujaca tablice w kolejnosci malejacej
       
           System.out.println("Wartosci w kolejnosci malejacej: "); {
		
                System.out.println(Arrays.toString(arr));
		}
    }
}