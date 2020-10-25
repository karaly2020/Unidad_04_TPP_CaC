/* Crear un programa que muestre en pantalla una escalera de asteriscos. La cantidad de filas de 
la escalera deberá ser una constante. Utilice la instrucción while.*/
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int altura;
        int contador2 = 0;
        System.out.println("Escriba un numero para definir la altura de la escalera:");
        altura = entrada.nextInt();
        
        for(int i=1; i<=altura;i++){
           int contador1 = 0;
           while(contador1<=contador2){
               System.out.print("*");
               contador1++;
           }
           contador2++;
           System.out.println("");
        }
    }
}
