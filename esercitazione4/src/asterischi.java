import java.util.Scanner;
public class asterischi {

	public static void main (String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci numero");
		int i = input.nextInt();
		for (int k = 0;k<=i;k++){
			for (int j=0;j<k;j++){
			System.out.print("*");
			}	
			System.out.println(" ");
		}
		}
	}

