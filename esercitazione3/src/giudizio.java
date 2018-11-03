import java.util.Scanner;
public class giudizio {
	public static void main (String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci voto:");
		int voto = input.nextInt();
		boolean errato = voto < 0 || voto > 30;
		boolean nonsuperato = voto >=0 && voto <= 17;
		boolean sufficiente = voto >= 18 && voto <= 24;
		boolean buono = voto >= 25 && voto <= 30;
		
		if (nonsuperato ) {
			System.out.println("Esame non superato");
		}
		else if (sufficiente){
			System.out.println("Giudizio: sufficiente");
			System.out.println("Vuoi registrare il voto? \n0 == si \n1 == no");
			int scelta = input.nextInt();
			switch (scelta){
			case 0:
				System.out.println("Voto registrato");
				break;
			case 1:
				System.out.println("Voto rifiutato");
				break;
			}
			
		}
		else if (buono){
			System.out.println("Giudizio: buono");
			System.out.println("Vuoi registrare il voto? \n0 == si \n1 == no");
			int scelta = input.nextInt();
			switch (scelta){
			case 0:
				System.out.println("Voto registrato");
				break;
			case 1:
				System.out.println("Voto rifiutato");
				break;
		}
		}
		else {
			System.out.println("Numero errato");
		}
	}
}
