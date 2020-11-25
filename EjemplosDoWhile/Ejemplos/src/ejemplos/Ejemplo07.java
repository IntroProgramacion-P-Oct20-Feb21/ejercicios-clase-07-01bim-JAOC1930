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
        String cadena="";
        do {
            cadena= String.format("%stabla de multiplicar del numero: %d\n"
                    , cadena, contador);
            for (int i = 1; i <= 10; i++) {
                operacion = i * contador;
                //System.out.printf("%d x %d = %d\n", contador, i, operacion);
                cadena= String.format("%s%d x %d = %d\n",cadena, contador, i
                        , operacion);
            }
            cadena= String.format("%s\n", cadena);
            contador = contador + 1;
        } while (contador <= 5);
        System.out.printf("%s",cadena);
    }
}
