
package examenu1u2;
import java.util.Scanner;

public class ExamenU1U2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
        System.out.println("Dime el nombre del primer producto: ");
        String producto1 = scanner.nextLine();
        System.out.println("Dime el nombre del segundo producto: ");
        String producto2 = scanner.nextLine();
        System.out.println("Dime el nombre del tercer producto: ");
        String producto3 = scanner.nextLine();
        System.out.println("Dime el precio del primer producto: ");
       double productouno = scanner.nextDouble();
      System.out.println("Dime el precio del segundo producto: ");
      double productodos = scanner.nextDouble();
      System.out.println("Dime el precio del tercer producto: ");
      double productotres = scanner.nextDouble();
      
      double porcentajee = (productouno*30)/100;
      double porcentajee2 = (productodos*65)/100;
       double porcentajee3 = (productotres*15)/100; 
        
        
        
        System.out.println("El nombre del primer producto es: "+producto1+ " Y su precio final es: "+ porcentajee);
        System.out.println("El nombre del segundo producto es: "+producto2+ " Y su precio final es: "+porcentajee2);
        System.out.println("El nombre del tercer producto es: "+producto3+ " Y su precio final es: "+porcentajee3);
        
        
        
        
        scanner.close();
       
        
       
       
    }
    
}
