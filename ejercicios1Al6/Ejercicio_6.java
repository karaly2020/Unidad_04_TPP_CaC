/* Ingresar por teclado los lados de un triángulo rectángulo (valores enteros)
y calcular el perímetro y su superficie. Para la raíz cuadrada de la
hipotenusa deberá utilizar la clase Math. Ayuda: la superficie es
base*altura/2 y el perímetro del triangulo es base+altura+hipotenusa,
donde hipotenusa = √(𝑏𝑎𝑠𝑒2 + 𝑎𝑙𝑡𝑢𝑟𝑎2)*/
package ejercicios1Al6;
import java.util.Scanner;
public class Ejercicio_6 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int ladoB, ladoA;
    double perimetro, superficie, hipotenusa;
    
    System.out.println("Ingrese la base del triangulo:");
    ladoB = entrada.nextInt();
    System.out.println("Ingrese la altura del triangulo:");
    ladoA = entrada.nextInt();
    
    hipotenusa = Math.sqrt(Math.pow(ladoB, 2) + Math.pow(ladoA, 2));
    superficie = (ladoB * ladoA)/2;
    perimetro = ladoB + ladoA + hipotenusa;
    
    System.out.println("El perimetro del triangulo es " +perimetro);
    System.out.println("La superficie del triangulo es " +superficie);
    }
}