/* Realizar un programa que divida dos números que introduzca el usuario. Si el segundo número es cero, 
se le deberá avisar y volver a pedir tantas veces como sea necesario, hasta que introduzca un número distinto de
cero, momento en que se calculará y mostrará el resultado de la división. */
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2;
        double division = 0;
        System.out.println("Introduzca el primer numero: ");
        numero1 = entrada.nextInt();
                
        do{
            System.out.println("Introduzca el segundo numero: ");
            numero2 = entrada.nextInt();
            if (numero2 != 0){
                division = numero1 / numero2;
                System.out.println("La division de los pares de numeros es:" +division);
            }else
                System.out.println("La division entre cero no es posible.");
        }while (numero2 == 0);
    }
}
        
 
