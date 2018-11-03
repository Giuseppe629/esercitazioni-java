import java.util.Scanner;
public class scrivoscrivoscrivo {
	public static void main (String args[]){
		System.out.println("inserisci numero");
		
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		input.close();
		int k = 0;
		if (i<0){
			System.out.println("errore");
		}
		while (i>=0){
			
			System.out.println(k);
			k++;
			i--;
		}
		
		
	}
}
