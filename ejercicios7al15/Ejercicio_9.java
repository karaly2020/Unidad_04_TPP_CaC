/* Desarrollar un algoritmo que, dada la cantidad de alumnos de un curso y la cantidad de sillas disponibles, la
computadora indique si alcanzan las sillas, en caso contrario, indique cuántas faltan para que todo el alumnado tenga asiento.*/
package ejercicios7al15;
import java.util.Scanner;
public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sillas, alumnos;
        System.out.println("Ingrese la cantidad de sillas:");
        sillas = entrada.nextInt();
        System.out.println("Ingrese la cantidad de alumnos:");
        alumnos = entrada.nextInt();
        if (sillas >= alumnos)
            System.out.println("Alcanza la cantidad de sillas:");
            else
                 System.out.println("No alcanzan las sillas. Faltan "  + (alumnos - sillas));   
    }
}
