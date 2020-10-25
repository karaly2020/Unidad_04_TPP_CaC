/*Ingresar el área de un cuadrado por teclado utilizando un objeto Scanner.
Calcular e imprimir el valor del perímetro. Ejemplo: Ingresa 25, debe
devolver 20. */
package ejercicios1Al6;
import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado, area, perimetro;
        
        System.out.println("Ingrese el area del cuadrado:" );
        area = entrada.nextDouble();
        lado = Math.sqrt(area);
        perimetro = 4 * lado;
        System.out.println("El perimetro del cuadrado es " +perimetro);
    }
}
