import java.util.Scanner;
public class calcolatrice {

	public static void main (String args[]){
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci 2 numeri:");
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println("Sciegli quale operazione effettuare: \n1 ==> addizione  \n2 ==> sottrazione \n3 ==> moltiplicazione \n4 ==> divisione ");
		int scelta = input.nextInt();
		switch (scelta){
			case 1:
				System.out.println(a + " + " + b + " = " + (a+b) );
				break;
			case 2:
				System.out.println(a + " - " + b + " = " + (a-b) );
				break;
			case 3:
				System.out.println(a + " x " + b + " = " + (a*b) );
				break;
			case 4:
				System.out.println(a + " : " + b + "\nQuoziente = " + (a/b) + "\nResto = " + (a%b));
				break;
			default:
				System.out.println("Operazione errata" );
	}
		input.close();
}
}