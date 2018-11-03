import java.util.Scanner;

class sommapprossimata{
  public static void main (String args[]){
    System.out.println("Inserisci un numero frazionario:");
    Scanner scan = new Scanner (System.in);
    double a = scan.nextDouble();
    System.out.println("Inserisci un altro numero frazionario:");
    double b = scan.nextDouble();
    scan.close();
    
    System.out.println("La somma è " + ((int)(a+b)));
    
  }
  
}