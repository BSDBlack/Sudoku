import java.util.Scanner;

public class SuSu {

		
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner (System.in);
			System.out.println("wie schwer solls den werden??? wähle 1 für Schwer, 2 für normal und 3 für leicht");
			int sg = sc.nextInt();
			
		//sudoku wird erstellt und nach schwirigkeit generiert
			
				
		while(true){	
			
			// ausgabe des erstelten sudoku feldes
			System.out.println("gibt mir erst die zeile dann die spalte und dann deine Zahl");
			String versuch = sc.nextLine();
			
			int zeile, spalte, wert;
			
			zeile = versuch.charAt(0);
			spalte = versuch.charAt(2);
			wert = versuch.charAt(4);
			
			//überprüfung auf true
			
			for(int i = 0; i <9; i++){
				for(int j = 0; j <9; j++)
				if (i == zeile  && j == spalte){
					// wert in array setzen
				}
			}
				
				
				
				
				//input : [zeile],[spalte],[wert]

			
			//überprüfung
		}

	}
	}


