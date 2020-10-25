/* Desarrollar un algoritmo que pida al usuario un número entre 1 y 12. La computadora muestra por pantalla el mes 
al que pertenece tal número. Si se ingresa un número fuera de rango, mostrar un error. Ejemplo: se ingresa un 4, 
la computadora muestra: “ABRIL” (utilice switch-case).*/
package ejercicios7al15;
import java.util.Scanner;
public class Ejercicio_13 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int numero;
       System.out.print("Digite un numero entre 1 y 12: ");
       numero = entrada.nextInt();
        
        switch (numero){
            case 1:
                System.out.println("Enero"); break;
            case 2:
                System.out.println("Febrero");break;
            case 3:
                System.out.println("Marzo");break;
            case 4:
                System.out.println("Abril");break;
            case 5:
                System.out.println("Mayo");break;
            case 6:
                System.out.println("Junio");break;
            case 7:
                System.out.println("Julio");break;
            case 8:
                System.out.println("Agosto");break;
            case 9:
                System.out.println("Septiembre");break;
            case 10:
                System.out.println("Octubre");break;
            case 11:
                System.out.println("Noviembre");break;
            case 12:
                System.out.println("Diciembre");break;
            default:
                System.out.println("Ingresaste un numero fuera del rango");  
        }
    }
}
