import java.util.Scanner;

public class SuSu {

		
		public static void main(String[] args) {
			
			
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("wie schwer solls den werden??? wähle 1 für Schwer, 2 für normal und 3 für leicht");
			int sg = sc.nextInt();
			
			if(sg == 1 || sg == 2 || sg ==3){	
			
			
		//Feld.generadeFeld();
		
		//Feld.schwirigkeit(sg);
			
				
				
				
		while(true){	
			
		//Feld.showFeld();
			
			System.out.println("gibt mir erst die zeile dann die spalte und dann deine Zahl");
			int zeile = sc.nextInt();
			int spalte = sc.nextInt();
			int wert = sc.nextInt();
					
					if(zeile == 0 && spalte == 0 && wert ==0)
					break;
			
			//Feld.fillIn(zeile spalte wert);
			
		}
		
		
		//Feld.pruefen();
		
		// ausgabe ob richtig oder falsch
		
		
			}
		else System.out.println("falsche eingabe");
		
}
}

				
			


