/* Desarrollar un algoritmo que permita ingresar los lados A, B y C de un triángulo. La computadora informa si
el triángulo es o no válido. En caso afirmativo, además informa si es equilátero, isósceles o escaleno. Ayuda:
según el teorema de desigualdad triangular, un triángulo es válido si se cumple que cada uno de los lados 
no puede ser más largo que la suma de los otros dos. Un triángulo equilátero es aquel que tiene sus tres lados
iguales. Un triángulo isósceles es aquel que tiene dos de sus lados iguales. Un triángulo escaleno es aquel
que tiene sus tres lados desiguales. Ejemplo: Se ingresa un 3, 4 y 5, la computadora muestra: “Es un triángulo
escaleno”. */
package ejercicios7al15;
import java.util.Scanner;
public class Ejercicio_11 {
    public static void main(String[] args) {    
        Scanner entrada = new Scanner(System.in);
        int ladoA, ladoB, ladoC, perimetro;
        System.out.println("Ingrese el lado A del triangulo: ");
        ladoA = entrada.nextInt();
        System.out.println("Ingrese el lado B del triangulo: ");
        ladoB = entrada.nextInt();
        System.out.println("Ingrese el lado C del triangulo: ");
        ladoC = entrada.nextInt();
        
        if ((ladoA < ladoB + ladoC)||(ladoB < ladoA + ladoC)|| (ladoC < ladoA + ladoC)){
            System.out.println("El triangulo es valido");
            if (ladoA == ladoB&&ladoB==ladoC){
                System.out.println("El triangulo es equilatero");
            }
            if ((ladoA==ladoB&&ladoA!=ladoC)||(ladoB==ladoC&&ladoB!=ladoA)||(ladoA==ladoC&&ladoA!=ladoB)){
                System.out.println("El triangulo es isosceles");
            }
            if ((ladoA!=ladoB)&&(ladoB!=ladoC)&&(ladoA!=ladoC)){
                System.out.println("El triangulo es escaleno");
            }
        }
        else{
            System.out.println("El triangulo no es valido");
        }
    }
}
