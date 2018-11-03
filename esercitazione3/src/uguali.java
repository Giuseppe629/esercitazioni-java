import java.util.Scanner;
public class uguali {
	public static void main (String args[]){
		System.out.println("Inserisci un numero: ");
		Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		System.out.println("Inserisci un numero: ");
		int b = input.nextInt();
		input.close();
		String res = (a ==b)? "sono uguali": "non sono uguali";
		System.out.println(res);
		
	}
}

