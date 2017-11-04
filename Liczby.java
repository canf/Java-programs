import java.util.Scanner;
public class Liczby {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int number = 0;
          int FirstDigit = 0;
          int count = 0;
          int number2=1;
          Scanner in = new Scanner(System.in);
          System.out.print("Enter a positive integer:");
          number = in.nextInt();
          for(;number2!=0;){
        	  count++;
          number2 = number/(int)Math.pow(10,count);
          }
          count--;
          do
          {
        	  FirstDigit = (int)(number / ((int)Math.pow(10,count)));
        	  number =number%(int)Math.pow(10,count);
        	  count--;
              switch ( FirstDigit ) {
              case 0:
    	          System.out.print("zero ");
    	          break;
    	      case 1:
    	          System.out.print("one ");
    	          break;
    	      case 2:
    	          System.out.print("two ");
    	          break;
    	      case 3:
    	          System.out.print("three ");
    	          break;
    	      case 4:
    	          System.out.print("four ");
    	          break;
    	      case 5:
    	          System.out.print("five ");
    	          break;
    	      case 6:
    	          System.out.print("six ");
    	          break;
    	      case 7:
    	          System.out.print("seven ");
    	          break;
    	      case 8:
    	          System.out.print("eight ");
    	          break;
    	      case 9:
    	          System.out.print("nine ");
    	          break;}
}
          while (number>0);
          
	}
 }