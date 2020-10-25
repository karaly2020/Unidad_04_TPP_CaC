/* Realizar un programa que lea números enteros hasta teclear 0, y nos muestre el máximo, el mínimo
(sin considerar el 0) y la media (promedio)de todos ellos. Piensa cómo debemos inicializar las variables. Utilice la
instrucción while.*/
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador;
        int numero =1;
        int numeroMin = 0;
        int numeroMax = 0;
        contador = 0;
        double promedio = 0;
        double suma = 0;
        
        while (numero!= 0){
            System.out.println("Digite un numero: ");
            numero = entrada.nextInt();
            if (numero !=0){
                if (numero > numeroMax || numeroMax == 0){
                    numeroMax = numero;
                }
                if (numero < numeroMin || numeroMin == 0){
                    numeroMin = numero;
                }
                suma += numero;
                contador++;
            }
        }
        if (contador != 0){
            promedio = suma / contador;
            System.out.println("El numero minimo es: " +numeroMin);
            System.out.println("El numero maximo es: " +numeroMax);
            System.out.println("El promedio de los numeros es: " +promedio);
        }else{
            System.out.println("Usted solo introdujo un cero");
        }
     }
}


