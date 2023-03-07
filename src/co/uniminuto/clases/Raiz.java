
package co.uniminuto.clases;

import java.util.Scanner;

/**
 *
 * @author Grupo
 */
public class Raiz extends Operacion{

     private double raiz = 0;
    
    public double solicitudRaiz(){
    Scanner read = new Scanner(System.in);
    System.out.println("Ingrese el numero para determitar la raiz cuadrada: ");
    this.raiz = read.nextDouble();
    
     this.numero1 = this.raiz ;
    
    return this.numero1;
    }
    
    @Override
    public double calculoOperacion() {
  
        double raiz =0;
               
        raiz = Math.sqrt(this.numero1);
        return raiz;
    
    }

 
  
   
    
}
