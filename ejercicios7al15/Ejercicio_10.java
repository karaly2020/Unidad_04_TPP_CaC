/* Desarrollar un algoritmo que, dados dos números enteros entre 0 y 100, la computadora indique si el mayor es 
divisible por el menor. Ejemplo: Ingresa 4 y 28, debe imprimir “28 es divisible por 4”. Se deberá validar
que los números ingresados se encuentren entre 0 y 100. */
package ejercicios7al15;
import java.util.Scanner;
public class Ejercicio_10 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Ingrese el primer numero:");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2 = entrada.nextInt();
               
        if (numero1 >= 0 && numero2 >= 0 && numero1 <=100 && numero2 <=100){
            if (numero1 > numero2) {
                if (numero1 % numero2 == 0) {
                    System.out.println("El numero " +numero1+ " es divisible por " +numero2); 
                }
                else
                System.out.println("El numero: " +numero1+ " no es divisible por " +numero2); }
            else
                if (numero2 % numero1 == 0)
                    System.out.println("El numero " +numero2+ " es divisible por " +numero1);
                else
                    System.out.println("El numero " +numero2+ " no es divisible por " +numero1);
            }else
                System.out.println("Los numeros ingresados son invalidos");    
    }
}

