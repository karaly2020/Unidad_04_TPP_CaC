/* Desarrollar un algoritmo que, dada la edad de una persona (entre 1 y 120
años) y su género ('F' para mujeres, 'M' para hombres), la computadora
indique si está en edad de jubilarse. Ayuda: Las mujeres se jubilan con 60
años o más. Los hombres se jubilan con 65 años o más. Ejemplo:
Ingresa 62 y 'M', debe devolver “No se jubila”.*/
package ejercicios7al15;
import java.util.Scanner;
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String sexo;
        int edad;
        System.out.println("Ingrese su sexo:");
        sexo = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        if (edad > 0 && edad < 120){
            if ((sexo.equalsIgnoreCase("M")) || (sexo.equalsIgnoreCase("F"))){
         if (sexo.equalsIgnoreCase("M")) {
             if (edad  >= 65){
                System.out.println("Se jubila"); 
             }
             else
                 System.out.println("No se jubila"); 
        }   else 
             if (edad  >= 62){
                System.out.println("Se jubila"); 
             }
            else
                 System.out.println("No se jubila"); 
            }        
            else
                System.out.println("El sexo es invalido"); 
        }
            else
                System.out.println("La edad es invalida"); 
    }
}