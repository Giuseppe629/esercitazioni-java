import java.util.Scanner;
public class indovinazero {
	public static void main (String args[]){
		
		Scanner input = new Scanner (System.in);
		System.out.println("inserisci un numero");
		int i = input.nextInt();
		while (i!=0){
			System.out.println("inserisci un numero");
			i =input.nextInt();
		}
		System.out.println("hai inserito zero");
		input.close();
		
	}
}
