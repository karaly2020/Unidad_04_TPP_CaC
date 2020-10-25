/* Desarrollar un algoritmo que permita ingresar un caracter. La
computadora indica si es o no una letra vocal (utilice switch-case). */
package ejercicios7al15;
import java.util.Scanner;
public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char caracter;
                
        System.out.println("Digite un caracter");
        caracter = entrada.next().charAt(0);
        
        switch (caracter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Ingresaste una vocal"); 
                break;              
            default:              
                System.out.println("No ingresaste una vocal");  
        }
    }
}
