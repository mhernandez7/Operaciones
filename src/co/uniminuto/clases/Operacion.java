package co.uniminuto.clases;

import co.uniminuto.interfaz.INumero;
import java.util.Scanner;
import static operaciones.Main.Division;
import static operaciones.Main.Multiplicacion;
import static operaciones.Main.Potencia;
import static operaciones.Main.Raiz;
import static operaciones.Main.Resta;
import static operaciones.Main.Suma;
/**
 *
 * @author Grupo
 */
public abstract class Operacion implements INumero {
    
    protected double numero1;
    protected double numero2;
    private double validar;
    
    
    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
      
    }

    public double getNumero1() {
        return numero1;
    }
    public double getNumero2() {
        return numero2;
    }
    
    public void solicitudNumero(){
    
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el numero 1");
        this.numero1 = read.nextDouble();
        System.out.println("Ingrese el numero 2");
        this.numero2 = read.nextDouble();
    }
    
    public void validacion(){
   
        Scanner read = new Scanner(System.in);
        int ingreso =0;
        System.out.println("Desea realizar otra operacion. 1 para si ");
        this.validar = read.nextDouble();
    
        if (this.validar == 1){
   
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
         }else {
            System.out.println("ha salido del programa: ");
            }
    }
    
    
    
}
