import java.util.Scanner;
public class oreinminuti {

	public static void main (String args[]){
		System.out.println("Inserisci un numero");
		Scanner input = new Scanner(System.in);
		double ore = input.nextDouble();
		
		System.out.println("minuti totali: " + (int)(ore*60));
		
		
	}
}
