import java.util.Scanner;

public class CiagFibonacciego {
		
	public static void main(String[] args){
		
		System.out.println("Podaj wartosc N poczatkowych wyrazow ciagu ktora chcesz policzyc: ");
		int wyraz = new Scanner(System.in).nextInt();
		
		System.out.println("Wyrazy ciagu Fibonacciego do " + wyraz +" wyrazu to: ");
		      for(int i=1; i<=wyraz; i++) {
			System.out.print(fibonacci(i) +" ");
	     	}
     	}
	 public static int fibonacci(int wyraz){
        if(wyraz == 1 || wyraz == 2){
            return 1;
        }
       return fibonacci(wyraz-1) + fibonacci(wyraz -2); 
    }
  
}