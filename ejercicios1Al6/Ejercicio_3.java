/* Desarrollar un algoritmo que permita ingresar dos números enteros por teclado. La computadora deberá mostrar 
su cociente con decimales.Recuerde utilizar Casting para obtener el resultado con los decimales correspondientes.*/
package ejercicios1Al6;
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero_1, numero_2;
        double cociente;
        System.out.println("Ingrese el primer numero:");
        numero_1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero_2 = entrada.nextInt();
        cociente = (double)numero_1 / numero_2;
        System.out.println("El cociente con decimales es: " +cociente);
    }
}
