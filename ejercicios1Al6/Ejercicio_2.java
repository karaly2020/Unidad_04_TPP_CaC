/*  Desarrollar un algoritmo que permita ingresar dos números enteros por teclado utilizando un objeto Scanner. 
La computadora deberá mostrar su cociente entero. El resto se deberá mostrar en otra línea. Ejemplo: 
Ingresa 23 y 5, debe devolver 4 y, en otra línea, 3. */
package ejercicios1Al6;
import java.util.Scanner;
 public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero_1, numero_2, cociente,residuo;
        
        System.out.println("Ingrese el primer numero:");
        numero_1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero_2 = entrada.nextInt();
        cociente = numero_1 / numero_2;
        System.out.println("El cociente entero es: " +cociente);
        residuo =  numero_1 % numero_2;
        System.out.println("El residuo es: " +residuo);     
    }
}
