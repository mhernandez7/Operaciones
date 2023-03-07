
package co.uniminuto.clases;

import java.util.Scanner;

/**
 *
 * @author Grupo
 */
public class Potencia extends Operacion{
    
    private double potencia = 0;
    
    public double solicitudPotencia(){
    Scanner read = new Scanner(System.in);
    System.out.println("Ingrese el numero para realizar potencia: ");
    this.potencia = read.nextDouble();
    
     this.numero1 = this.potencia;
    
    return this.numero1;
    }
    @Override
    public double calculoOperacion() {
        double potencia=0;
        potencia = Math.pow(this.numero1, this.numero1);
        return potencia;
    }

      
   
  
    
}
