/*Crear un programa que muestre en pantalla una escalera inversa de asteriscos. La cantidad de filas de 
la escalera se ingresa por teclado. Utilice la instrucción for. */
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int altura;
        System.out.println("Escriba un numero para definir la altura de la escalera:");
        altura = entrada.nextInt();
        
        for (int i = altura; i >0; i --){
            for (int j=i; j>0; j--){
            System.out.print("*");
            }
            System.out.println(" ");
        }           
    }
}
