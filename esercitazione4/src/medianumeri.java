import java.util.Scanner;
public class medianumeri {
	public static void main (String args[]){
	
		Scanner input = new Scanner(System.in);
		int i=0;
		int k=0;
		int j=0;
		
		do {
		
			System.out.println("inserisci numero");
			i = input.nextInt();
			if (i>0){
			System.out.println("i = " + i);
			
			k++;
			System.out.println("k = " + k);
			j+=i;
			System.out.println("j = " + j);
			}
			else {
				
			}
		}
		 while (i>=0);
		input.close();
		System.out.println("La media è: " + (j/k));
		
	}
	

}
