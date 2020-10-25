/* Teniendo en cuenta que la clave es “eureka”, escribir un algoritmo que nos pida una clave. Solo tenemos 3 
intentos para acertar, si fallamos los 3 intentos nos mostrará un mensaje indicándonos que hemos agotado
esos 3 intentos. Si acertamos la clave, saldremos directamente del programa. Utilice la instrucción while.*/
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        String clave;
        boolean claveIngresada = false;
        
        while (contador < 3 && claveIngresada == false){
            //contador ++;
            System.out.println("Digite una nueva clave para ingresar: ");
            clave = entrada.nextLine();
            
            if (clave.equals("eureka")){
                System.out.println("La clave ingresada es correcta. Bienvenido");
                claveIngresada = true;
            }
            contador++;
        }
            if (contador == 3 && claveIngresada == false){
            System.out.println("Ya no tiene mas intentos. Intente mas tarde.");
            }
    }
}
        
        
