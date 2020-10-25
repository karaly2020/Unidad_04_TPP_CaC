/* Ingresar por teclado 1 número entero y mostrar por pantalla su tabla de multiplicar entre 1 y 10 (usando la
instrucción while)*/
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, tabla;
        int i = 0;
        
        System.out.print("Digite un numero: ");
        numero = entrada.nextInt();
        System.out.println("La tabla de multiplicar del numero " +numero+ " es: ");
        while (i <= 9){
            i++;
            tabla = numero * i;
            System.out.println(numero+ " por " +i+ " es igual a " +tabla );
        }
    }
}
