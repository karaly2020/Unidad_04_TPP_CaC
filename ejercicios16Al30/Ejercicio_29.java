/* CHacer un programa que permita calcular la suma de pares de números. Pedirá dos números al usuario y
mostrará su suma, volviendo a repetir hasta que ambos números introducidos sean 0. */
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, suma;
                
        do{
            System.out.println("Introduzca el primer numero: ");
            numero1 = entrada.nextInt();
            System.out.println("Introduzca el segundo numero: ");
            numero2 = entrada.nextInt();
            suma = numero1 + numero2;
            
            if (numero1 == 0 || numero2 ==0){
                System.out.println("Hay al menos introducido un cero. Ingrese nuevamente ambos numeros.");
                
            }else
                System.out.println("La suma de los pares de numeros es:" +suma);
                System.out.println("");
        }while (numero1 != 0 || numero2 != 0);
        
    }
}
        
 
