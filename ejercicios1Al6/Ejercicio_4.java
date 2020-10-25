/* Ingresar por teclado el diámetro (tipo de dato entero) de un círculo y calcular su perímetro pero sólo deberá
mostrar la parte entera del resultado. Defina el valor de PI como una constante con valor 3,14. Ejemplo: Ingresa 10, 
debe devolver perímetro = 31. Realice Casting para obtener la parte entera del resultado.  */
package ejercicios1Al6;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int diametro, perimetro;
        double Pi;
        Pi = 3.14;
        System.out.println("Ingrese el diametro del circulo:");
        diametro = entrada.nextInt();
        perimetro = (int)(Pi * diametro);
        System.out.println("El perimetro del circulo es: " +perimetro);
    }
}
