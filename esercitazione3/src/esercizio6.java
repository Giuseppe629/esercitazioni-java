import java.util.Scanner;
public class esercizio6{
	public static void main (String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci due numeri: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		boolean apari = (a%2)==0;
		boolean bpari = (b%2)==0;
		
		if ( !(!(apari) || !(bpari))){
			System.out.println("sono entrambi pari");
		}
		else {
			System.out.println("non sono entrambi pari");
		}
		}
	}
	
