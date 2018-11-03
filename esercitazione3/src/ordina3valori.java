import java.util.Scanner;
public class ordina3valori {
	public static void main (String args[]){
		System.out.println("Inserisci un numero");
		Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		System.out.println("Inserisci un numero");
	
		int b = input.nextInt();
		System.out.println("Inserisci un numero");

		int c = input.nextInt();
		int [] vect =  new int[3];
		if (a<b ){
			if (a<c){
				vect[0] = a;
				if (b<c){
					vect[1] = b;
					vect[2] = c;
					
				}
				else {
					vect[1] = c;
					vect[2] = b;
				}
			}
			else{
				vect[0] = c;
				vect[1] = a;
				vect[2] = b;
			}
		}
		
		
		
		else{
				if (b>c){
					vect[0] = c;
					vect[1] = b;
					vect[2] = a;
			}
				else{
					vect[0] = b;
					vect[1] = a;
					vect[2] = c;
				}
		
		
		
		
		}
	for (int i =0; i<3; i++){
		System.out.print (vect[i] + " ");
	}
		input.close();
	
}
}