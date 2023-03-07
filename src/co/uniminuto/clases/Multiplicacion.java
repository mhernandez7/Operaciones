
package co.uniminuto.clases;

public class Multiplicacion extends Operacion{
     
    @Override
    public double calculoOperacion() {
   double multiplicacion=0;
   
   multiplicacion = this.numero1*this.numero2;
   return multiplicacion;
    
    }

    
    
}
