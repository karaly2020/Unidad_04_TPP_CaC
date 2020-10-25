/* Ingresar por teclado 1 número entero y mostrar por pantalla su tabla de multiplicar entre 1 y 10
(usando la instrucción for).*/
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, tabla;
        System.out.print("Digite un numero: ");
        numero = entrada.nextInt();
        System.out.println("La tabla de multiplicar del numero: " +numero+ " es: ");
        for (int i= 1; i<=10; i++){
            tabla = numero * i;
            System.out.println(numero+ " por " +i+ " es igual a " +tabla );
        }
    }
}
