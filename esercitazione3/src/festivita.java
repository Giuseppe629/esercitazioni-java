import java.util.Scanner;
public class festivita {
	public static void main (String args[]){
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Inserisci un giorno");
		int giorno = input.nextInt();
		boolean giornok  = giorno > 0 && giorno <  32;
		
		
		
		if (giornok){
			System.out.println("Inserisci mese");
			int mese = input.nextInt();
			boolean meseok  = mese > 0 && mese <  13;
			input.close();
			if (meseok){
				if (giorno == 1 && mese == 1){
					System.out.println("Capodanno");
				}
				else if (giorno == 6 && mese == 1){
					System.out.println("Epifania");
				}
				else if (giorno == 15 && mese == 8){
					System.out.println("ferragosto");
				}
				else if (giorno == 25 && mese == 12){
					System.out.println("natale");
				}
				else {
				System.out.println("non è una festa");
				}
			}
			else{
				System.out.println("ERROE: VALORE MESE SBAGLIATO");	
				}
		}
		else {
			System.out.println("ERROE: VALORE GIORNO SBAGLIATO");
		}
	}
		
		
	}
	

