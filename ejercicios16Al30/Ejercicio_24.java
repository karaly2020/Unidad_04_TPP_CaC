/* Ingresar por teclado los pesos (en Kg)de los alumnos de un curso. La carga finaliza cuando el peso ingresado
es igual a 0. Se pide averiguar cual es el promedio de los pesos y mostrarlo con 2 decimales
Utilice la instrucción do-while..*/
package ejercicios16Al30;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio_24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso =1;
        double sumaPesos = 1;
        int contador = 0;
        double promedio = 1;
        do{
            System.out.println("Escriba el peso del alumno:");
            peso = entrada.nextDouble();
                       
            if (peso>0){
                sumaPesos += peso;
                contador++;
            }
        }while (peso!=0);
        promedio = (double)sumaPesos/contador;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("El promedio de los pesos de los alumnos es: "+(df.format(promedio)));
    }
}
        
        
