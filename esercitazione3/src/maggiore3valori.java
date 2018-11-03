import java.util.Scanner;
public class maggiore3valori {
	public static void main (String args[]){
		System.out.println("Inserisci un numero");
		Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		System.out.println("Inserisci un numero");
		
		int b = input.nextInt();
		System.out.println("Inserisci un numero");

		int c = input.nextInt();
		if (a>b && a>b){
			System.out.println(a + " maggiore");
		}
		else if (b>a && b>c ){
			System.out.println(b + " maggiore");
			
		}
		else {
			System.out.println(c + " maggiore");
			
		}
		input.close();
		
	}
}
