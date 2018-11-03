import java.util.Scanner;
public class minutinore {
	public static void main(String args[]){
	System.out.print("Inserisci un numero intero: ");
	Scanner input = new Scanner (System.in);
	int minuti = input.nextInt();
		if (minuti > 119){
			System.out.println(minuti + " minuti corrispondono a " + (minuti/60) + " ore e " + (minuti - 60) + " minuti.");
		}
		else {
			System.out.println(minuti + " minuti corrispondono a " + (minuti/60) + " ora e " + (minuti - 60) + " minuti.");
		}
		
	}
}
