/* Crear un programa que pida al usuario un usuario y una contraseña. Deberá repetirse hasta que el usuario
sea "admin" y la contraseña sea "1234". */
package ejercicios16Al30;
import java.util.Scanner;
public class Ejercicio_28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuario = " ";
        int clave = 0;
        
        while (!usuario.equals("admin")||clave != 1234){
            System.out.println("Digite un usuario para ingresar: ");
            usuario = entrada.next();
            
            
            System.out.println("Digite una clave para ingresar: ");
            clave = entrada.nextInt();
            
            
            if (usuario.equals("admin")&& clave == 1234){
                System.out.println("Usuario y clave correctos");
            }else{
                System.out.println("Usuario y/o clave incorrectos"); 
                usuario = "";
            }
        }
    }
}
        
 
