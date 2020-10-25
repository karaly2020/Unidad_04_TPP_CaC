/* Desarrollar un algoritmo que simule una calculadora básica que realice operaciones de suma, resta, 
multiplicación y división. Se deben recibir como entrada dos números reales y un operador, 
que puede ser '+', '-', '*' ó '/'. La salida del programa debe ser el resultado de la operación. Ayuda:
Prever que se puede llegar a intentar hacer una división por cero. */
package ejercicios7al15;
import java.util.Scanner;
public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, suma, resta, multiplicacion, division;
        char operacion;
        
        System.out.println("Menu de opciones:");
        System.out.println("Digite [+] para sumar:");
        System.out.println("Digite [-] para restar:");
        System.out.println("Digite [*] para multiplicar:");
        System.out.println("Digite [/] para dividir:");
        System.out.println("Digite la operacion a realizar");
        operacion = entrada.next().charAt(0);
        System.out.println("Digite el primer numero");
        numero1 = entrada.nextDouble();
        System.out.println("Digite el segundo numero");
        numero2 = entrada.nextDouble();
        
        switch (operacion){
            case '+':
                System.out.println("Ingresaste suma");
                suma = numero1 + numero2;
                System.out.println("El resultado es:" +suma);break;
            case '-':
                System.out.println("Ingresaste resta");
                resta = numero1 - numero2;
                System.out.println("El resultado es:" +resta);break;
            case '*':
                System.out.println("Ingresaste multiplicacion");
                multiplicacion = numero1 * numero2;
                System.out.println("El resultado es:" +multiplicacion);break;
            case '/':
                System.out.println("Ingresaste division");
                if (numero2!=0){
                    division = numero1 / numero2;
                System.out.println("El resultado es:" +division);break;
                }else
                    System.out.println("La division entre cero no es posible");break;      
            default:
                System.out.println("Ingresaste una operacion invalida");        
        }   
    }
}
