import java . util . Scanner ;
public class scambia {
	public static void main ( String [] args ) {
		Scanner input = new Scanner ( System . in );
		int x , y ;
		System.out.println ( " Inserisci il primo numero : " );
		x = input . nextInt ();
		System.out.println ( " Inserisci il secondo numero : " );
		y = input . nextInt ();
		input.close();
		x = x+y;
		y = x-y;
		x = x-y;

		System.out.println ( "Ecco i numeri inseriti in ordine inverso : " );
		System.out.println (x);
		System.out.println (y);
}
}