/* Ingresar por teclado números enteros, la carga finaliza cuando se ingresa un cero. Se pide calcular 
y mostrar el número de valor máximo y el mínimo (utilice do-while)..*/
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int numeroMaximo = 1;
        int numeroMinimo = 1;
                      
        do{
        System.out.println("Escriba un numero entero:");
        numero = entrada.nextInt();
            if (numero > numeroMaximo){
            numeroMaximo = numero;
            }
            if (numero < numeroMinimo && numero !=0){
            numeroMinimo = numero;
            }
        }
        while (numero!=0);
        System.out.println("El valor maximo es: " +numeroMaximo);
        System.out.println("El valor minimo es: " +numeroMinimo); 
    }
}
