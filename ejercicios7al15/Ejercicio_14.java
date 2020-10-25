/* Desarrollar un algoritmo que permita el ingreso de una letra, correspondiente a un dígito del sistema de 
numeración romano. La computadora muestra su correspondiente valor decimal. Si se ingresa una letra inexistente,
computadora informa que no existe tal dígito. Ejemplo: Se ingresa 'D', la computadora muestra: 500.*/
package ejercicios7al15;
import java.util.Scanner;
public class Ejercicio_14 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       char letra;
       System.out.print("Ingrese un digito del sistema de numeracion romano:");
       letra = entrada.next().charAt(0);
       switch (letra){
            case 'I':
                System.out.println("1"); break;
            case 'V':
                System.out.println("5"); break;
            case 'X':
                System.out.println("10"); break;
            case 'L':
                System.out.println("50"); break;
            case 'C':
                System.out.println("100"); break;
            case 'D':
                System.out.println("500"); break;
            case 'M':
                System.out.println("1000"); break;
            default:
                System.out.println("No existe ese digito"); 
       }
    }
}
