/* Ingresar por teclado el radio (tipo de dato entero) de un círculo y calcular
su perímetro y superficie (definidos como double). Utilice la Clase Math
para obtener el valor de PI. Ejemplo: Ingresa 5, debe devolver
perímetro = 31,41592654 y superficie = 78,53981634 */
package ejercicios1Al6;
import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int radio;
        double perimetro, superficie;
        
        System.out.println("Ingrese el radio del circulo:" );
        radio = entrada.nextInt();
        
        perimetro = 2 * Math.PI * radio;
        superficie = Math.PI * Math.pow(radio, 2);
        
        System.out.println("El perimetro del circulo es " +perimetro);
        System.out.println("La superficie del circulo es " +superficie);
    }
}
