
import java.util.Scanner;

public class PodatekDochodowy {
public static void main (String[] args ) {
double dochod;
Scanner keyboard = new Scanner (System.in);

System.out.println ("Program poda wysokosc podatku dochodowego ");
System.out.println ("Prosze podac swoj dochod ( prosze uzyc przecinka ): ");
dochod=keyboard.nextDouble ();

if ( dochod<=85528)
{ 
double y = ((dochod * 0.18 ) - 556.02 ) ;
System.out.println (" Twoj podatek dochodowy wynosi :" + y + "zl" );
}

if (dochod>85528)
{
double x = ( 14839.02 + ((dochod-85528)*0.32)) ;
System.out.println ("Twoj podatek dochodowy wynosi : " + x + "zl");
} 


System.out.println ( "Twoj dochod wynosi : " + dochod+ "zl" );
}
}