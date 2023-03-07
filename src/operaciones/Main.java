
package operaciones;

import co.uniminuto.clases.Potencia;
import co.uniminuto.clases.Suma;
import co.uniminuto.clases.Resta;
import co.uniminuto.clases.Multiplicacion;
import co.uniminuto.clases.Division;
import co.uniminuto.clases.Raiz;
import java.util.Scanner;
/**
 *
 * 1. Crear un programa que permita realizar las 4 operaciones básicas y 2 operaciones
      adicionales. Operaciones básicas: suma, resta, multiplicación, división.
 */
public class Main {
    
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int ingreso = 0;
    
    System.out.println("Seleccione el tipo de operacio que desea realizar: ");
    System.out.println("para suma ingrese           (0) ");
    System.out.println("para resta ingrese          (1) ");
    System.out.println("para Multiplicacion ingrese (2) ");
    System.out.println("para Division ingrese       (3) ");
    System.out.println("para Potencia ingrese       (4) ");
    System.out.println("para raiz ingrese           (5) ");
    ingreso = read.nextInt();
    
        switch (ingreso) {
            case 0:
                Suma();
                break;
            case 1:
                Resta();
                break;
            case 2:
                Multiplicacion();
                break;
            case 3:
                Division();
                break;
            case 4:
                Potencia();
                break;
            case 5:
                Raiz();
            default:
                break;
        }
    }
    public static void Suma(){
        Suma suma = new Suma();
        suma.solicitudNumero();
        System.out.println("El resultado de la suma es: "+suma.calculoOperacion());
        suma.validacion();
        
    }
    public static void Resta(){
        Resta resta = new Resta();
        resta.solicitudNumero();
        System.out.println("El resultado de la resta es: "+resta.calculoOperacion()); 
        resta.validacion();
        
    }
    public static void Multiplicacion(){
        Multiplicacion multi = new Multiplicacion();
        multi.solicitudNumero();
        System.out.println("El resultado de la multiplicaciones: "+multi.calculoOperacion());
        multi.validacion();
    }
    public static void Division(){
        Division divi = new Division();
        divi.solicitudNumero();
        System.out.println("El resultado de la division es: "+divi.calculoOperacion()); 
        divi.validacion();
    }
    public static void Potencia(){
        Potencia pot = new Potencia();
        pot.solicitudPotencia();
        System.out.println("La potencia del mismo numero es: "+pot.calculoOperacion());
        pot.validacion();
                
    }
    public static void Raiz(){
        Raiz raiz = new Raiz();
        raiz.solicitudRaiz();
        System.out.println("la raiz cuadrada del numero es: "+raiz.calculoOperacion());
        raiz.validacion();
        
    }
}
