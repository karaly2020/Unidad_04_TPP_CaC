/* Desarrollar un algoritmo que permita ingresar un número N. Acto seguido, permitir ingresar N números enteros, 
correspondientes a las notas de un curso. La computadora muestra el promedio de las notas ingresadas.
Ejemplo: Se ingresa 4, luego 4 7 3 9, la computadora muestra: 5.75.*/
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroN, nota;
        double sumaNotas = 0;
        double promedio = 0;
                       
        System.out.println("Digite la cantidad de notas a ingresar: ");
        numeroN = entrada.nextInt();
        
        for (int i=1; i<=numeroN; i++){
            System.out.print("Ingrese la nota obtenida: ");
            nota = entrada.nextInt();
            if (nota>= 0 && nota<=10){
                sumaNotas += nota;
                promedio = (double)sumaNotas / numeroN; 
            }
        }
        System.out.print("El promedio de las notas de un curso es: " +promedio);
    }
}
