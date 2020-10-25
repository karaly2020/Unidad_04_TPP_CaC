/* Codifique un programa en Java que permita el ingreso de un número, y a partir de ello, mostrar 
los diez números siguientes al mismo. Resuelva el ejercicio con las siguientes estructuras iterativas: 
for, while y do-while.*/
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Digite un numero: ");
        numero = entrada.nextInt();
        
        for (int i= 0; i<10; i++){
            numero ++;
            System.out.println(numero);
        }
    }
}
