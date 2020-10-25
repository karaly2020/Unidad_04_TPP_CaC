/* Desarrollar un algoritmo que permita al usuario ingresar 12 valores, de a uno por vez, pertenecientes a sus
sueldos mensuales durante un año. La computadora muestra su sueldo anual. Si durante la carga de los sueldos
mensuales se detecta un valor negativo, esto indica que aún no se ha cobrado el mes en curso, por lo tanto, 
deben dejar de ingresarse datos y la computadora debe mostrar la sumatoria de sueldos que se llevan
cobrados hasta dicho mes.
 */
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sueldoMensual = 0;
        double sueldoAnual = 0;
        int contador = 0;
        
        do{
            System.out.println("Digite el sueldo mensual: ");
            sueldoMensual = entrada.nextInt();
            contador++;
                if (sueldoMensual >0){
                sueldoAnual += sueldoMensual;     
                }
        }while (sueldoMensual >0 && contador<12);
        System.out.println("La sumatoria de los sueldos es: " +sueldoAnual);
    }
}
