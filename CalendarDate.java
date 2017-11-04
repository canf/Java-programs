import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDate {

	public static void main(String[] args){
		
	DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
     Calendar calobj = Calendar.getInstance();
     System.out.println(df.format(calobj.getTime()));
    }
	}