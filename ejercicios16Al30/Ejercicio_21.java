/* Desarrollar un algoritmo que permita ingresar un número natural. La computadora muestra el 
factorial del número. Ejemplo: Se ingresa 5, la computadora muestra: 120.*/
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        double factorial = 1;
                               
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        while (numero != 0){
            factorial *= numero;
            numero--;
        }
        System.out.print("El factorial es: " +factorial);
    }
}
