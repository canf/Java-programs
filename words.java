import java.util.Scanner;
public class AnalizaWyrazow {
    public static void main(String[] args){
        
String str;
Scanner scan = new Scanner(System.in);

System.out.println("enter a string: ");
str = scan.nextLine();

 String [] arrOfStr = str.split(" ");
 System.out.println("Your string is: ");
        for (String a : arrOfStr)
            System.out.println(a);
    }
}
