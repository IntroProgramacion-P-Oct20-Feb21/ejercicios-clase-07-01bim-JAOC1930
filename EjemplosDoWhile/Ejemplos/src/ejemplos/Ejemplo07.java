/*
 
 */
package ejemplos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {

    public static void main(String[] args) {
               
        int operacion;
        int contador = 1;
        
        do {
            for (int i = 1; i <= 10; i++) {
                operacion = i * contador;
                System.out.printf("%d x %d = %d\n", contador, i, operacion);
            }
            System.out.println("\n");
            contador = contador + 1;
        } while (contador <= 5);

    }
}
