import java.util.Scanner;
public class uguali {
	public static void main (String args[]){
		System.out.println("Inserisci un numero: ");
		Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		System.out.println("Inserisci un numero: ");
		int b = input.nextInt();
		input.close();
		if (a!=b) {
			System.out.print("non ");
		}
		System.out.print("sono uguali");
		
	}
}

