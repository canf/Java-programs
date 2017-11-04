import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		ArrayList<String> workers = new ArrayList<>();
		boolean loop = true;
		String nazwisko = "";
		String imie = "";
		while(loop) {
			System.out.println("Enter worker name:");
			imie = reader.nextLine();
			System.out.println("Enter worker surname:");
			nazwisko = reader.nextLine();
			imie = imie.substring(0, 1).toUpperCase() + imie.substring(1).toLowerCase();
			nazwisko = nazwisko.substring(0, 1).toUpperCase() + nazwisko.substring(1).toLowerCase();
			
			workers.add(imie + " " + nazwisko);
			System.out.println("If you want to exit write down 'exit'\nin other case press enter");
			if(reader.nextLine().equals("exit")) {
				loop=false;
			}	
		}
		System.out.println("\n\nWYPISYWANIE PRACOWNIKOW :");
		for(int i = 0 ;i<workers.size();i++) {
			System.out.println(workers.get(i));
		}
		
		reader.close();
		
	}
}

