/* Codifique un programa en Java que permita saber si un número ingresado
por teclado es par o impar.*/
package ejercicios7al15;
import java.util.Scanner;
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero:" );
        numero = entrada.nextInt();
        if (numero % 2 == 0){
            System.out.println("El numero ingresado es par" );
         }
        else{
            System.out.println("El numero ingresado es impar" );
        }  
    }
}
