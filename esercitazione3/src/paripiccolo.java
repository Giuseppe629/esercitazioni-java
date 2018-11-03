import java.util.Scanner;
public class paripiccolo {
	public static void main (String args[]){
		System.out.println("inserisci numero");
		Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		if (a <100 && a%2 == 0){
			System.out.println("pari e piccolo");
		}
		else {
			System.out.println("non è pari e piccolo");
		}
		
	}
}
