import java.util.Scanner;
public class contanumericrescenti {
	public static void main (String args[]){
		System.out.println("inserisci numero");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int k=0;
		int j=0;
		do {
			j = i;
			System.out.println("inserisci numero");
			i = input.nextInt();
			k++;
		}
		while (i>j);
		System.out.println("Hai immesso una sequenza lunga " + k);
	}
	

}
