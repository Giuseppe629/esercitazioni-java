
public class tavolapitagorica {
	public static void main (String args[]){
		int k = 0;
		for (int i = 1; i<=10; i++){
			for ( k = 1; k <= 10;k++){
				if ((k*i)<10){
					System.out.print("   ");
				}
				else if ((k*i)<100){
					System.out.print("  ");
				}
				else {
					System.out.print(" ");
				}
				System.out.print( k * i);
				
				
			}
			
			System.out.println();
			
		}
	}
}

