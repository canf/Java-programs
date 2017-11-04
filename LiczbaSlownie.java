import java.util.Scanner;
public class LiczbaSlownie {
	public static void main(String[] args) {
		
          int liczba = 0;
          int FirstDigit = 0;
          int count = 0;
          int liczba2=1;
          Scanner in = new Scanner(System.in);
          System.out.print("Wpisz dowoln¹ ca³kowit¹ liczbê dodatni¹: ");
          liczba = in.nextInt();
          for(;liczba2!=0;){
        	  count++;
          liczba2 = liczba/(int)Math.pow(10,count);
          }
          count--;
          do
          {
        	  FirstDigit = (int)(liczba / ((int)Math.pow(10,count)));
        	  liczba = liczba%(int)Math.pow(10,count);
        	  count--;
              switch ( FirstDigit ) {
              case 0:
    	          System.out.print("zero ");
    	          break;
    	      case 1:
    	          System.out.print("jeden ");
    	          break;
    	      case 2:
    	          System.out.print("dwa ");
    	          break;
    	      case 3:
    	          System.out.print("trzy ");
    	          break;
    	      case 4:
    	          System.out.print("cztery ");
    	          break;
    	      case 5:
    	          System.out.print("piêæ ");
    	          break;
    	      case 6:
    	          System.out.print("szeœæ ");
    	          break;
    	      case 7:
    	          System.out.print("siedem ");
    	          break;
    	      case 8:
    	          System.out.print("osiem ");
    	          break;
    	      case 9:
    	          System.out.print("dziewiêæ ");
    	          break;}
}
          while (liczba>0);
          
	}
 }